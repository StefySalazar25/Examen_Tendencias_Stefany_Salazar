package stefanyentregas.stefanyentregas.demo.stefanyproducto;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StefanyProductoService {

    private final StefanyProductoRepository repository;

    public StefanyProductoService(StefanyProductoRepository repository) {
        this.repository = repository;
    }

    public StefanyProducto saveStefanyProducto(StefanyProducto producto) {
        return repository.save(producto);
    }

    public List<StefanyProducto> getAllStefanyProductos() {
        return repository.findAll();
    }

    public StefanyProducto getStefanyProductoById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteStefanyProducto(Long id) {
        repository.deleteById(id);
    }
}
