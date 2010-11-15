package factorie

import org.junit.Test

@Test
class LdaExampleTest{
 
  @Test
  def testMain{
    val inputDir = "src/test/resources/sample-docs"
    LdaExample.run(inputDir)
  }
}

