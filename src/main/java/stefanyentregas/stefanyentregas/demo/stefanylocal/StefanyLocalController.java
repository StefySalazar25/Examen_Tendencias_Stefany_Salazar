package stefanyentregas.stefanyentregas.demo.stefanylocal;

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
public class StefanyLocalController {
    @Autowired
    private StefanyLocalService pedidoService;

    //Api create
    @PostMapping("/")
    public StefanyLocal stefanyave(@RequestBody StefanyLocal entity)
    {
        return pedidoService.stefanysave(entity);
    }

    //Api find by Id
    @GetMapping("/{id}")
    public StefanyLocal stefanyfindById(@PathVariable Long id){
    return pedidoService.stefanygetById(id);
    }

    //Api update
    @PutMapping("/")
    public StefanyLocal stefanyupdate(@RequestBody StefanyLocal entity){
        return pedidoService.stefanysave(entity);
    }

    //Api delete
    @DeleteMapping("/{id}")
    public void stefanydelete(@PathVariable Long id){
        pedidoService.stefanydeleteById(id);
    }

    //Api select All
    @GetMapping("/")
    public List<StefanyLocal> stefanyfindAll(){
      return pedidoService.stefanyfindAll();
    }

}