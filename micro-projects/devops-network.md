# 🐳 DevOps & Network

> Start with: Dockerize Node app → docker-compose → GitHub Actions CI

## Docker & Compose

- [ ] Dockerize Node app (multi-stage build)
- [ ] docker-compose: app + Mongo + Redis
- [ ] Nginx reverse proxy in Docker
- [ ] Healthcheck in Docker

## CI/CD

- [ ] Simple GitHub Actions CI (lint + test)
- [ ] CI with matrix (multiple Node versions)
- [ ] CD deploy to VPS via SSH
- [ ] Automatic semantic versioning

## Production Concerns

- [ ] Healthcheck endpoint (deep check for DB & cache)
- [ ] Graceful shutdown handler
- [ ] Structured logger (winston/pino) + correlation ID
- [ ] .env config loader with validation
- [ ] Metrics endpoint (Prometheus format)
- [ ] Error monitoring integration (Sentry-style)

## Network & Protocol Level

- [ ] HTTP server from scratch (using net module)
- [ ] TCP echo server
- [ ] Simple DNS resolver
- [ ] Mini reverse proxy
- [ ] Round-robin load balancer
- [ ] WebSocket protocol implementation
