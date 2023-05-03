# Java BDD using Cucumber

For BDD, Cucumber provides few keywords and the features are written in a file with `.feature` extension. The features have three main stages.
1. `Scenario`: This is high level component which is being tested.
2. `Given`: Provided that this condition is given
3. `When` and `And`: When this is given
4. `Then` and `And`: Then these two items should happen.

For each of these cases, there will be separate code block that gets executed. If one of them is missed, Cucumber gives out an error.
The code is written in `stepdefinition` file which is glue from this feature to the actual code that should get executed. There will be third file which is `TestRunner` which defines where the code is located for each feature and what tests to be run using which testing framework etc.

If we want to pass multiple values, we can use `DataTable` or we can also provide `Scenario Outline` which will run the same set of tests with different input values provided with `Examples`. This is used for Test parameterization in order to avoid repeating same test codes.

If we want to selectively run only few tests, we can provide tags like `@RegTest` and specify which tags to execute in `TestRunner` file.
If we have to do some pre-requisitive for all tests, for example, provided the user has opened browser and is logged in, we can use `Background` keyword in the feature. This must be at the top of feature file.

If we want to execute some code before some types of tests, we can define those in `Hooks`. These will include `@Before` and `@After` annotations which point to specific types of tags. This code will be executed before any of those tag tests unlike `Background` which executes for every test in the feature file.
When `Background` and `Hooks` are used together, Hooks execute before `Background`.

To show reports in Cucumber, we have to add options in `TestRunner` file. This is defined using property `plugin` where we can specify what format we want the test results to be available and where.
There is option `dryRun` which just scans and compiles teste. This helps validate that we have implemented all scenarios and features and not missed anything in defining and mapping step definitions.


Cucumber reuses existing code base by defining `Given` and `Background` and running same step definitions. Gherkin also forces us to cover all scenarios defined in features file. We cannot skip any single test. To run single test file we can use `mvn -Dtest=TestRunner test`

