package AwsCredential;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import io.micronaut.context.annotation.Value;

import javax.inject.Singleton;

@Singleton
public class AwsCredentailService implements AWSCredentialsProvider {
    String accessKey = "AKIAJHCPEMGKVESIULLQ";
    String secretKey = "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";

    @Override
    public AWSCredentials getCredentials() {

        return new BasicAWSCredentials(accessKey, secretKey);
    }

    @Override
    public void refresh() {

    }


}
