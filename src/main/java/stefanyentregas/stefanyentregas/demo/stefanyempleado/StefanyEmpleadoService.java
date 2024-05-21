package stefanyentregas.stefanyentregas.demo.stefanyempleado;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StefanyEmpleadoService {

    private final StefanyEmpleadoRepository repository;

    public StefanyEmpleadoService(StefanyEmpleadoRepository repository) {
        this.repository = repository;
    }

    public StefanyEmpleado saveStefanyEmpleado(StefanyEmpleado empleado) {
        return repository.save(empleado);
    }

    public List<StefanyEmpleado> getAllStefanyEmpleados() {
        return repository.findAll();
    }

    public StefanyEmpleado getStefanyEmpleadoById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteStefanyEmpleado(Long id) {
        repository.deleteById(id);
    }
}
