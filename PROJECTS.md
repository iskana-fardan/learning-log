# 🚀 Projects

Substantial projects with their own repositories — capstone builds where I
combined multiple concepts into something runnable & demo-able.

> Smaller single-concept experiments → [playground/](./playground/README.md)  
> Idea backlog → [micro-projects/](./micro-projects/README.md)

---

## 🔐 Backend & Auth

### [jwt-auth-playground](https://github.com/USERNAME/jwt-auth-playground) ✅

A complete JWT auth flow with access + refresh token rotation, refresh token
reuse detection, and httpOnly cookie storage. Includes register / login /
refresh / logout endpoints with proper security hardening.

- **Stack**: Node.js · Express · MongoDB · bcrypt · jsonwebtoken
- **Concepts**: Authentication, token rotation, secure cookies, reuse detection
- **Built**: May 2026 · **Time invested**: ~12 hours
- 📖 [Related notes](./topics/jwt-deep-dive.md)

### [rate-limiter-service](https://github.com/USERNAME/rate-limiter-service) 🚧

Standalone rate limiter service exposing token bucket and sliding window
strategies via HTTP. Backed by Redis with Lua scripting for atomic ops.

- **Stack**: Node.js · Express · Redis · Docker
- **Concepts**: Rate limiting algorithms, distributed state, Lua scripting
- **Started**: June 2026

---

## 🚀 Full-stack Apps

### [url-shortener-mini](https://github.com/USERNAME/url-shortener-mini) ✅

URL shortener with custom slugs, analytics dashboard, and click tracking.
Demonstrates DB indexing, collision handling, caching layer, and a minimal
admin UI.

- **Stack**: Node.js · PostgreSQL · Redis · React · Tailwind
- **Concepts**: Hashing, indexing, caching, full-stack data flow
- **Built**: July 2026 · **Time invested**: ~20 hours
- 🌐 [Live demo](https://url-mini.example.com) · 📖 [Design notes](./topics/url-shortener-design.md)

### [realtime-kanban](https://github.com/USERNAME/realtime-kanban) 📝

Trello-like kanban with real-time sync across clients. Drag & drop, optimistic
UI updates, and conflict resolution.

- **Stack (planned)**: Node.js · Socket.io · MongoDB · React · dnd-kit
- **Concepts**: WebSockets, optimistic UI, real-time conflict resolution
- **Planned**: August 2026

---

## ⚛️ Frontend

### [react-component-lab](https://github.com/USERNAME/react-component-lab) ✅

A small library of reusable React components built from scratch — modal,
toast, infinite scroll, virtual list. Each component has its own demo and
docs in Storybook.

- **Stack**: React · TypeScript · Vite · Tailwind · Storybook
- **Concepts**: Compound components, render props, custom hooks, a11y
- **Built**: June 2026 · **Time invested**: ~25 hours
- 🌐 [Storybook demo](https://react-lab.example.com)

---

## 🎯 Currently Focused On

- Finishing rate-limiter-service (Redis Lua scripting is harder than expected)
- Planning realtime-kanban architecture before coding
- Learning Java for DSA — see [playground/](./playground/README.md) for impl

---

## Status legend

| Symbol | Meaning                               |
| ------ | ------------------------------------- |
| ✅     | Shipped & runnable                    |
| 🚧     | In progress                           |
| 📝     | Planned                               |
| 🗑️     | Archived / abandoned (lesson learned) |

## Stats

- Total: 5
- Shipped: 3 · In progress: 1 · Planned: 1
- Last updated: 22 July 2026

---

## Template for new entries

```markdown
### [project-name](https://github.com/USERNAME/project-name) STATUS_EMOJI

Short 2-3 sentence description of what it does and why you built it.

- **Stack**: tech1 · tech2 · tech3
- **Concepts**: concept1, concept2, concept3
- **Built/Started**: Month YEAR · **Time invested**: ~X hours
- 🌐 [Demo](url) · 📖 [Notes](path)
```
