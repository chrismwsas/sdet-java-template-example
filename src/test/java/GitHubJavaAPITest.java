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
        GitHubClient client = new GitHubClient();
        client.setCredentials("chrismwsas", "5413a523970a57e521bc489c0ff350fe15f7d7eb");

        UserService userService = new UserService(client);

        try
        {
            User user = userService.getUser();
            String name = user.getLogin();

            Assert.assertEquals("chrismwest", name);

        }
        catch (IOException io)
        {
            Assert.fail("IO Exception: ".concat(io.getLocalizedMessage()));
        }

    }

}
