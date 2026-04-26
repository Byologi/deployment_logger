package deployment_logger.exception;

public class DeploymentNotFoundException  extends RuntimeException{

    public DeploymentNotFoundException(String message){
        super(message);
    }
}
