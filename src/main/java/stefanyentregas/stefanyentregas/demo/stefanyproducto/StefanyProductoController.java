package stefanyentregas.stefanyentregas.demo.stefanyproducto;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stefany-productos")
public class StefanyProductoController {

    private final StefanyProductoService service;

    public StefanyProductoController(StefanyProductoService service) {
        this.service = service;
    }

    @PostMapping
    public StefanyProducto createStefanyProducto(@RequestBody StefanyProducto producto) {
        return service.saveStefanyProducto(producto);
    }

    @GetMapping
    public List<StefanyProducto> getAllStefanyProductos() {
        return service.getAllStefanyProductos();
    }

    @GetMapping("/{id}")
    public StefanyProducto getStefanyProductoById(@PathVariable Long id) {
        return service.getStefanyProductoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStefanyProducto(@PathVariable Long id) {
        service.deleteStefanyProducto(id);
    }
}
