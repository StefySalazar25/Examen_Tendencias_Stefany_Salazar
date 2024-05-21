package stefanyentregas.stefanyentregas.demo.stefanylocal;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StefanyLocalService {
    @Autowired
    private StefanyLocalRepository consultorioRepository;

    //Metodo create
    public StefanyLocal stefanysave(StefanyLocal entity)
    {
        return consultorioRepository.save(entity);
    }
    
    //Metodo select by Id
    public StefanyLocal stefanygetById(Long id){
        return consultorioRepository.findById(id).orElse(null);
    }

    //Metodo delete by Id
    public void stefanydeleteById(Long id){
        consultorioRepository.deleteById(id);
    }

    //Metodo select all
    public List<StefanyLocal> stefanyfindAll(){
        return consultorioRepository.findAll();
    }    
}