package stefanyentregas.stefanyentregas.demo.stefanypedido;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StefanyPedidoService {
    @Autowired
    private StefanyPedidoRepository pedidoRepository;

    //Metodo create
    public StefanyPedido save(StefanyPedido entity)
    {
        return pedidoRepository.save(entity);
    }
    
    //Metodo select by Id
    public StefanyPedido stefanyfindById(Long id){
        return pedidoRepository.findById(id).orElseThrow();
    }

    //Metodo delete by Id
    public void stefanydeleteById(Long id){
        pedidoRepository.deleteById(id);
    }

    //Metodo select all
    public List<StefanyPedido> stefanyfindAll(){
        return pedidoRepository.findAll();
    }  
}
