##  Given Classes

* `OrderService`
* `EmailClient`
* `Demo01`

---

#  Single Responsibility Principle (SRP) Violation

##  Definition

> A class should have only one reason to change.

---

##  Where the Violation Exists

Inside `OrderService`:

```java
double totalWithTax(double subtotal);
```

 Tax calculation responsibility

```java
email.send(...);
```

 Notification responsibility

```java
System.out.println("Order stored (pretend DB).");
```

Data persistence responsibility

---

##  How I Identified It

I asked:

> Does this class have more than one job?

`OrderService` is:

* Calculating tax
* Sending email
* Storing order

That means it has **multiple responsibilities**.

If:

* Tax rules change → modify class
* Email logic changes → modify class
* Database logic changes → modify class

 Multiple reasons to change → SRP violation.

---

##  Solution for SRP

Separate responsibilities into different classes:

* `TaxService`
* `NotificationService`
* `OrderRepository`
* `OrderService` (only coordinates)

Example:

```java
class TaxService {
    double calculate(double subtotal) {
        return subtotal + subtotal * 0.18;
    }
}
```

Now each class has only one job.

---

# Dependency Inversion Principle (DIP) Violation

##  Definition

> High-level modules should not depend on low-level modules.
> Both should depend on abstractions.

---

##  Where the Violation Exists

```java
EmailClient email = new EmailClient();
```

---

##  How I Identified It

I asked:

1. Which class contains business logic? → `OrderService`
2. Which class is a technical detail? → `EmailClient`
3. Is the high-level class directly creating the low-level class? → Yes.

So the dependency is:

```
OrderService → EmailClient
```

That is tight coupling.

---

##  Problems Caused

* Cannot replace Email with SMS easily
* Hard to unit test
* Must modify OrderService if Email changes
* Low flexibility

---

## Solution for DIP

### Step 1 — Create abstraction

```java
interface NotificationService {
    void send(String to, String message);
}
```

### Step 2 — Implement it

```java
class EmailClient implements NotificationService {
    public void send(String to, String message) {
        System.out.println("[EMAIL to=" + to + "] " + message);
    }
}
```

### Step 3 — Inject dependency

```java
class OrderService {

    private NotificationService notificationService;
    private TaxService taxService;

    OrderService(NotificationService notificationService,
                 TaxService taxService) {
        this.notificationService = notificationService;
        this.taxService = taxService;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = taxService.calculate(subtotal);
        notificationService.send(customerEmail,
                "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}
```

Now structure becomes:

```
OrderService → NotificationService ← EmailClient
```

✔ Both depend on abstraction
✔ Loosely coupled
✔ Easy to extend
✔ Easy to test
