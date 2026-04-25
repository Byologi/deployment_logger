package deployment_logger.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DeploymentRequest {

    @NotBlank(message = "Project name is required")
    private String projectName;

    @NotBlank(message = "Version is required")
    private String version;

    @NotBlank(message = "Status is required")
    private String status;
}