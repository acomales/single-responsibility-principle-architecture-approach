# Single responsibility principle approach

Use Single responsibility principle to drive software architecture.
Everything needed for specific business use case is located in its own package.
Only entities and repositories are shared between use-cases.
Where there is some common logic between use cases, it can be extracted to separate package called `service` or in the `common` module.
