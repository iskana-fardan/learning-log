# 💾 Database

> Start with: E-commerce mini schema → One-to-many → Many-to-many

## Universal (SQL & NoSQL)

### Fundamental Relations & Schema

- [ ] Full CRUD with validation
- [ ] One-to-one relation (user ↔ profile)
- [ ] One-to-many relation (user → posts)
- [ ] Many-to-many relation (post ↔ tags)
- [ ] Self-referencing (user → followers, comment → reply)
- [ ] Polymorphic relation (like for post or comment)
- [ ] Schema design: e-commerce mini
- [ ] Schema design: blog with categories & nested comments

### Query & Access Pattern

- [ ] Offset-based pagination
- [ ] Cursor-based pagination
- [ ] Combined filtering & sorting
- [ ] Search with partial match
- [ ] Aggregate stats per group
- [ ] Bulk insert performance test

### Universal Patterns

- [ ] Soft delete
- [ ] Audit log
- [ ] Record versioning
- [ ] Repository pattern abstraction
- [ ] Optimistic locking (version field)
- [ ] Database seeder + faker
- [ ] Custom migration runner
- [ ] Connection pooling test

### Performance

- [ ] N+1 query problem demo + fix
- [ ] Index vs no-index benchmark
- [ ] Caching layer (Redis in front of DB)
- [ ] Slow query logger

### DB-heavy Mini Apps

- [ ] URL shortener with collision handling
- [ ] Bookmarking app (folder + tag)
- [ ] Voting/polling system
- [ ] Follow + activity feed
- [ ] Nested comment system (3-5 levels)
- [ ] Notification table with read/unread
- [ ] Inventory with concurrent update protection
- [ ] Mini e-wallet (consistent transfers)

## 🍃 MongoDB Specific

- [ ] Embedded vs referenced (practice both)
- [ ] Aggregation pipeline (analytics dashboard)
- [ ] $lookup join across collections
- [ ] Text search with text index
- [ ] Geospatial query (find within radius)
- [ ] Change streams (real-time triggers)
- [ ] TTL index (auto-expire sessions/OTPs)
- [ ] Capped collection (fixed-size logging)
- [ ] GridFS (large file storage in Mongo)
- [ ] Compound index optimization
- [ ] Multikey index (array field)
- [ ] Multi-document transaction
- [ ] Time-series collection

### Mongo Schema Patterns

- [ ] Bucket pattern (time-series grouping)
- [ ] Subset pattern (recent embedded, rest separate)
- [ ] Computed pattern (precompute aggregates)
- [ ] Tree: parent ref vs array of ancestors vs materialized path

## 🐘 PostgreSQL Specific

### SQL Fundamentals

- [ ] JOIN variations (INNER, LEFT, RIGHT, FULL, CROSS)
- [ ] Subquery vs JOIN performance
- [ ] GROUP BY + HAVING practice
- [ ] UNION, INTERSECT, EXCEPT

### Advanced Postgres

- [ ] Window functions (ranking, running total, lag/lead)
- [ ] CTE (Common Table Expressions)
- [ ] Recursive CTE (tree traversal)
- [ ] Views (regular & materialized)
- [ ] Triggers (auto-update, audit)
- [ ] Stored functions/procedures
- [ ] JSONB column practice
- [ ] Array & ENUM types
- [ ] Generated columns
- [ ] Full-text search (tsvector + GIN)
- [ ] Partial index
- [ ] LISTEN/NOTIFY (built-in pub-sub)
- [ ] Row-level security (multi-tenant)

### Concurrency & Locking

- [ ] SELECT FOR UPDATE (pessimistic)
- [ ] Optimistic locking with version
- [ ] Advisory locks
- [ ] Race condition simulator + fix
- [ ] Transaction isolation level practice

### Performance

- [ ] EXPLAIN ANALYZE practice
- [ ] Index types: B-tree, GIN, GiST, BRIN
- [ ] Table partitioning
- [ ] VACUUM & autovacuum demo

### Extensions

- [ ] uuid-ossp
- [ ] pgcrypto
- [ ] postgis (geospatial)
- [ ] pg_trgm (fuzzy search)
