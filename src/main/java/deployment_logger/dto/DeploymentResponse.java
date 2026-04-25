package deployment_logger.dto;

import java.time.LocalDateTime;

public class DeploymentResponse {

    private Long id;
    private String projectName;
    private String version;
    private String status;
    private LocalDateTime createdAt;

}