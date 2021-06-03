package ro.ase.csie.cts.g1093.testing.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({ImportantTests.class, PerformanceTest.class});
@SuiteClasses({ TestStudent.class, TestStudentNewTests.class })
public class AllImportantTests {

}
