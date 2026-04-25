package deployment_logger.service;

import deployment_logger.dto.DeploymentRequest;
import deployment_logger.entity.Deployment;
import deployment_logger.repository.DeploymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeploymentService {

    private final DeploymentRepository repository;

    public DeploymentService(DeploymentRepository repository) {
        this.repository = repository;
    }

    // Save deployment
    public Deployment saveDeployment(Deployment deployment) {
        deployment.setCreatedAt(java.time.LocalDateTime.now());
        return repository.save(deployment);
    }

    // Get all deployments
    public List<Deployment> getAllDeployments() {
        return repository.findAll();
    }

    
    public Deployment getDeploymentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Deployment not found"));
    }


    public void deleteDeployment(Long id) {
        repository.deleteById(id);
    }

    public Deployment saveFromRequest(DeploymentRequest request) {

        Deployment deployment = new Deployment();

        deployment.setProjectName(request.getProjectName());
        deployment.setVersion(request.getVersion());
        deployment.setStatus(request.getStatus());
        deployment.setCreatedAt(java.time.LocalDateTime.now());

        return repository.save(deployment);
    }
}