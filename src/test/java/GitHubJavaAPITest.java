import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.UserService;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GitHubJavaAPITest {

    @Test
    public void test_BasicAuthenticationGetUserName()
    {
        String username = "user";
        String token = "token";

        GitHubClient client = new GitHubClient();
        client.setCredentials(username, token);

        UserService userService = new UserService(client);

        try
        {
            User user = userService.getUser();
        }
        catch (IOException io)
        {
            Assert.fail("IO Exception: ".concat(io.getLocalizedMessage()));
        }

    }

}
