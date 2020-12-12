package org.onedatashare.transferservice.odstransferservice.model;

import lombok.*;
import org.onedatashare.transferservice.odstransferservice.Enum.EndpointType;
import org.onedatashare.transferservice.odstransferservice.model.credential.AccountEndpointCredential;
import org.onedatashare.transferservice.odstransferservice.model.credential.OAuthEndpointCredential;


import java.util.ArrayList;

@Data
@NoArgsConstructor
@Getter
public class TransferJobRequest {

    @NonNull private String ownerId;
    private int priority;
    @NonNull private int chunkSize;
    @NonNull private String id;
    @NonNull private Source source;
    @NonNull private Destination destination;
    private TransferOptions options;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Destination {
        @NonNull private EndpointType type;
        private AccountEndpointCredential vfsDest;
        private OAuthEndpointCredential oauthDest;
        @NonNull private String credId;
        private EntityInfo info;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Source {
        @NonNull private EndpointType type;
        private AccountEndpointCredential vfsSource;
        private OAuthEndpointCredential oauthSource;
        @NonNull private String credId;
        @NonNull private EntityInfo info;
        @NonNull private ArrayList<EntityInfo> infoList;
    }
}