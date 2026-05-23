# 🔐 Authentication & Security

> Start with: JWT auth → Password reset flow → Rate limiter

## Authentication

- [ ] JWT auth (access + refresh token rotation)
- [ ] OAuth 2.0 login (Google or GitHub)
- [ ] Session-based auth with cookies
- [ ] API key authentication system
- [ ] Magic link login (passwordless)
- [ ] 2FA with TOTP (Google Authenticator compatible)

## Authorization

- [ ] Role-based access control (RBAC)
- [ ] Attribute-based access control (ABAC) basics
- [ ] Reusable permission middleware

## User Flow

- [ ] Password reset flow (token + email)
- [ ] Email verification flow
- [ ] Account lockout after X failed attempts

## Security Hardening

- [ ] Rate limiter (token bucket / sliding window)
- [ ] CSRF protection demo
- [ ] XSS sanitization playground
- [ ] SQL injection demo + mitigation
- [ ] Bcrypt vs Argon2 comparison
- [ ] Refresh token reuse detection
- [ ] Secure cookie config (httpOnly, sameSite, secure)
