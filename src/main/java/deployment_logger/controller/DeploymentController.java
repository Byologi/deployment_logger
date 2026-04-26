package deployment_logger.controller;



import deployment_logger.dto.DeploymentRequest;
import deployment_logger.entity.Deployment;
import deployment_logger.service.DeploymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deployments")
public class DeploymentController {

    private final DeploymentService service;

    public DeploymentController(DeploymentService service) {
        this.service = service;
    }

    // CREATE (POST)
    @PostMapping
    public Deployment create(@RequestBody @jakarta.validation.Valid DeploymentRequest request) {
        return service.saveFromRequest(request);
    }

    // READ (GET)
    @GetMapping
    public List<Deployment> getAll() {
        return service.getAllDeployments();
    }



    //UPDATE
    @PutMapping("/{id}")
    public Deployment updateDeployment(@PathVariable Long id, @RequestBody Deployment updatedDeployment) {

        Deployment existing = service.getDeploymentById(id);

        existing.setProjectName(updatedDeployment.getProjectName());
        existing.setVersion(updatedDeployment.getVersion());
        existing.setStatus(updatedDeployment.getStatus());

        return service.saveDeployment(existing);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public void deleteDeployment(@PathVariable Long id) {
        service.deleteDeployment(id);
    }
}
