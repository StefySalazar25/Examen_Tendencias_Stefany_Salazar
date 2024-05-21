package stefanyentregas.stefanyentregas.demo.stefanypedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")
public class StefanyPedidoController {
    @Autowired
    private StefanyPedidoService pedidoService;

    //Api create
    @PostMapping(value = "pedido")
    public StefanyPedido save(@RequestBody StefanyPedido entity)
    {
        return pedidoService.save(entity);
    }

    //Api find by Id
    @GetMapping(value = "pedido/{id}")
    public StefanyPedido findById(@PathVariable ("id") Long id){
    return pedidoService.stefanyfindById(id);
    }

    //Api update
    @PutMapping(value = "pedido")
    public StefanyPedido update(@RequestBody StefanyPedido entity){
        return pedidoService.save(entity);
    }

    // Api delete
    @DeleteMapping(value = "pedido/{id}")
    public void delete(@PathVariable("id") Long id) {
        pedidoService.stefanydeleteById(id);
    }

    //Api select All
    @GetMapping(value = "pedido")
    public List<StefanyPedido> findAll(){
      return pedidoService.stefanyfindAll();
    }
}
