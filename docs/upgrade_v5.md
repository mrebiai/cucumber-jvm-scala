# Upgrading from 4.x to 5.x

If you are using Cucumber Scala 4.7.x and want to upgrade to 5.x, please note there are some major changes in addition to the Cucumber upgrade itself.

Starting from version 5.x, Cucumber Scala will try to be as close as possible to the Cucumber Java implementation while remaining Scala oriented.
This means that package names, parameters order, internal code... will be more consistent with the Java implementation.

## Packages

All Cucumber Scala classes are now under `io.cucumber.scala` package instead of `cucumber.api.scala`.

## Hooks

The `Before`, `BeforeStep`, `After` and `AfterStep` definitions have slightly changed:
- to apply only to scenarios with some tags, the `String*` parameter is replaced by a single tag expression of type `String`.
This changes comes from Cucumber itself.
- if providing both an order and a tag expression, the order is now the second parameter instead of the first.
This is more consistent with the Java implementation.

For instance, the following code:

```scala
Before(1, "@tag1", "@tag2") { _ =>
  // Do Something    
}
```

Is replaced by:

```scala
Before("@tag1 or @tag2", 1) { _ =>
  // Do Something    
}
```

See also the [Hooks documentation](hooks.md).