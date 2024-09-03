import org.example.Exception.UserListEmptyException;
import org.example.application.SecretSantaApp;
import org.example.model.UserOutput;
import org.junit.Assert;
import org.junit.jupiter.api.*;

import java.util.List;

@DisplayName("SecretSantaApplicationIntegrationTest")
public class SecretSantaTest {


    String inputTestFilePath = "src/test/resources/users-test-data.csv";
    SecretSantaApp secretSantaAppInstance;
    @BeforeEach
    public void displayMessage()
    {
        System.out.println("Running testcase...");
        secretSantaAppInstance = new SecretSantaApp();
    }

    @Test
    @DisplayName("Integration Test #1")
    void runTest1() throws UserListEmptyException {
        //Arrange & Act
        List<UserOutput> actualOutput = secretSantaAppInstance.startProcessing(inputTestFilePath);

        //Assert
        Assertions.assertEquals(4, actualOutput.size());

    }

    @AfterEach
    public void tearDown() {
        System.out.println("Finished testcase..");
    }


}
