# 🏛️ OOP & Design Patterns

> Order: 4 Pillars → Core concepts → SOLID → Patterns → Real-world apps

## 4 Pillars

### Encapsulation

- [ ] Bank account (private balance, access via methods)
- [ ] Student grade system (validate scores 0-100)
- [ ] Password manager (internal hashing, expose safe API)
- [ ] Counter with rules (no negatives, max limit)

### Inheritance

- [ ] Shape hierarchy (Circle, Square, Triangle with area())
- [ ] Vehicle hierarchy (Car, Motorcycle, Truck)
- [ ] Employee hierarchy (FullTime, PartTime, Contractor — different salary calc)

### Polymorphism

- [ ] Payment processor (CreditCard, PayPal, Crypto — one interface)
- [ ] Notification sender (Email, SMS, Push)
- [ ] Document exporter (PDF, Word, HTML)

### Abstraction

- [ ] Abstract DatabaseConnection → Mongo/Postgres implementations
- [ ] Abstract Game class with template method
- [ ] Generic Repository<T> interface

## Core Concepts

- [ ] Static vs instance practice
- [ ] Composition vs Inheritance (same project, 2 versions)
- [ ] Method overloading & overriding + super
- [ ] Generics: Stack<T>, Queue<T>, Pair<K,V>
- [ ] Custom exception hierarchy
- [ ] Immutable class (final fields)
- [ ] Equals & hashCode contract
- [ ] Comparable vs Comparator
- [ ] Enum with behavior (not just constants)

## SOLID Principles

- [ ] **S** — Refactor a God Object into single responsibilities
- [ ] **O** — Extensible discount calculator
- [ ] **L** — Rectangle vs Square problem
- [ ] **I** — Refactor a fat interface (e.g., Worker)
- [ ] **D** — Notification depends on interface, not concrete class
- [ ] Bonus: refactor one of your existing projects applying SOLID

## Design Patterns

### Creational

- [ ] Singleton (Logger / Config / DB Connection)
- [ ] Factory Method (Shape factory)
- [ ] Abstract Factory (UI component per OS)
- [ ] Builder (chained Pizza builder)
- [ ] Prototype (deep clone)

### Structural

- [ ] Adapter (legacy ↔ new API bridge)
- [ ] Decorator (Coffee + Milk + Sugar)
- [ ] Facade (HomeTheater.startMovie())
- [ ] Composite (File system tree)
- [ ] Proxy (lazy loading / access control)

### Behavioral

- [ ] Strategy (swappable sorting algorithms)
- [ ] Observer (event system)
- [ ] Command (undo/redo in text editor)
- [ ] State (traffic light)
- [ ] Template Method (game framework)
- [ ] Chain of Responsibility (middleware / approval workflow)
- [ ] Iterator (custom collection)
- [ ] Mediator (chat room)
- [ ] Memento (game save state)

## Real-world Mini Apps

### Classic (interview favorites)

- [ ] Parking lot system
- [ ] Elevator system
- [ ] Vending machine
- [ ] ATM simulator
- [ ] Library management

### Games

- [ ] Tic-tac-toe OOP
- [ ] Snake game
- [ ] Hangman
- [ ] Chess pieces hierarchy
- [ ] Blackjack or Poker
- [ ] Tetris

### Realistic systems

- [ ] Restaurant ordering
- [ ] Hotel booking
- [ ] Ride-sharing mini
- [ ] E-commerce cart with discount strategy
- [ ] Movie ticket booking
- [ ] Hospital management
- [ ] School/course system

### Infrastructure

- [ ] Custom Logger framework
- [ ] Event Emitter from scratch
- [ ] Mini DI container
- [ ] Mini ORM (Active Record)
- [ ] State machine library
- [ ] Cache library (LRU, LFU)
- [ ] Validation library (chainable API)

## Java-Specific

- [ ] Generics with bounded types
- [ ] Collections framework (when to use which)
- [ ] Iterator + Iterable
- [ ] Functional interface + lambda
- [ ] Stream API combined with OOP
- [ ] Optional<T>
- [ ] Record class
- [ ] Sealed classes
- [ ] Pattern matching switch
- [ ] Inner/nested/anonymous class — when to use which
