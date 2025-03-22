# 💳 Payment Adapter System

A Java implementation of the **Adapter Design Pattern**, showcasing how multiple payment methods can be unified under a common interface. This project demonstrates a clean and modular architecture where different payment systems (cash, credit card, bank transfer) are adapted to a single `Payment` interface, making the system easily extensible and maintainable.

---

## ✨ Features

- ✅ Implements the **Adapter Design Pattern** in Java.
- ✅ Abstracts payment methods under a single `Payment` interface.
- ✅ Demonstrates polymorphism and object-oriented design principles.
- ✅ Easy to add new payment types (e.g., PayPal, Crypto, Mobile Wallets).
- ✅ Console-based output for simplicity and clarity.

---

## ⚙️ Requirements

Before running the project, make sure you have:

- 📦 **Java Development Kit (JDK)** 8 or higher  
- 💻 A Java-friendly IDE (like IntelliJ IDEA, Eclipse, or VS Code) or terminal access  
- 🧠 Basic understanding of Java and design patterns (especially Adapter pattern)

---

## 📦 Installation

You can run this project locally by following these steps:

```bash
# 1. Clone the repository
git clone https://github.com/your-username/payment-adapter-system.git

# 2. Navigate to the project directory
cd payment-adapter-system

# 3. Compile all Java files
javac *.java

# 4. Run the application
java Main


payment-adapter-system/
├── Main.java                     # Entry point, runs all payments
├── Payment.java                  # Common Payment interface
│
├── CashAdapterDone.java          # Adapter class for cash payments
├── CashPaymentSystem.java        # Concrete cash payment system logic
│
├── CreditCardAdapter.java        # Adapter class for credit card payments
├── CreditCardPaymentSystem.java  # Logic for charging a credit card
│
├── TransferAdapter.java          # Adapter class for bank transfers
├── TransferPaymentSystem.java    # Logic for sending bank transfers
│
└── README.md                     # Project documentation (this file)

Processing Payments...
Cash: 100.0 TL received.
Credit Card: 250.0 TL charged from card 1234-5678-9012-3456.
Transfer: 500.0 TL sent via IBAN TR123456789012345678901234.
