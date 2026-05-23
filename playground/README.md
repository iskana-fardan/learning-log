# 🧪 Playground

Small code experiments — single-concept demos, typically 1-3 hours of work each.
Every subfolder is self-contained with its own README explaining what it demonstrates.

> Substantial projects with their own repos → [PROJECTS.md](../PROJECTS.md)  
> Project ideas to pick from → [micro-projects](../micro-projects/README.md)

## How to use

Each subfolder has its own README + runnable code. Pick one, read the README,
poke around. Most experiments are deliberately minimal to spotlight one idea.

## Index

### 🔐 Auth & Security

- [rate-limiter-token-bucket](./rate-limiter-token-bucket) — Token bucket algorithm in Node ✅
- [refresh-token-rotation](./refresh-token-rotation) — JWT refresh token with reuse detection ✅
- [csrf-double-submit](./csrf-double-submit) — CSRF double-submit cookie pattern 🚧

### ☕ Data Structures (Java)

- [linked-list](./linked-list) — Singly & doubly linked list from scratch ✅
- [lru-cache](./lru-cache) — LRU using HashMap + DoublyLinkedList ✅
- [trie-autocomplete](./trie-autocomplete) — Trie with autocomplete suggestions 🚧
- [min-heap](./min-heap) — Min-heap + priority queue 📝

### 🏛️ OOP Patterns

- [bank-account-encapsulation](./bank-account-encapsulation) — Encapsulation drill in Java ✅
- [payment-strategy](./payment-strategy) — Strategy pattern for payment methods ✅
- [observer-event-emitter](./observer-event-emitter) — Custom EventEmitter from scratch ✅
- [state-traffic-light](./state-traffic-light) — State pattern with traffic lights 📝

### ⚡ Async & Performance

- [debounce-throttle](./debounce-throttle) — Utility implementations + visual demo ✅
- [retry-with-backoff](./retry-with-backoff) — Exponential backoff helper 🚧
- [circuit-breaker](./circuit-breaker) — Basic circuit breaker pattern 📝

### 🌐 REST API Patterns

- [cursor-pagination](./cursor-pagination) — Cursor-based pagination demo ✅
- [zod-validation-middleware](./zod-validation-middleware) — Reusable validation middleware 🚧

### 💾 Database

- [soft-delete-pattern](./soft-delete-pattern) — Soft delete + restore in Mongo ✅
- [audit-log-mongo](./audit-log-mongo) — Track who changed what when 📝

## Status legend

- ✅ Done — readable & runnable
- 🚧 In progress
- 📝 Planned

## Convention per experiment

Each playground folder should contain at minimum:

```
folder-name/
├── README.md      ← what it demonstrates, how to run, key takeaways
├── src/           ← the actual code
└── package.json   ← (or pom.xml / etc, depending on stack)
```

Optional:

- `notes.md` — deeper exploration if there was a rabbit hole
- `benchmark.md` — if you measured something

## Adding a new experiment

1. Create folder with kebab-case name (e.g., `bloom-filter`)
2. Add a `README.md` from [the template](./_template/README.md)
3. Add entry to the index above with status
4. Commit: `feat: add <experiment-name> playground`
