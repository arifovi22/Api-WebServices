import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GetApiRequest {
public CloseableHttpResponse getRequest(String url) throws  IOException {
    CloseableHttpClient client = HttpClients.createDefault();
    HttpGet get = new HttpGet(url);// http get request
    CloseableHttpResponse response = client.execute(get);// hit the http and get all the data
    return response;

}

    //get method with header
    public CloseableHttpResponse getRequestWithHeader(String url, HashMap<String, String> header)throws ClientProtocolException, IOException {

        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);// http get request
        for (Map.Entry<String, String> entry : header.entrySet()) {
            get.addHeader(entry.getKey(), entry.getValue());
        }

        CloseableHttpResponse response = client.execute(get);// hit the http and get all the data
        return response;
    }








}
