package com.myportfolio.portfolio.Interface;

import com.myportfolio.portfolio.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> getPersona();
  
    public void savePersona(Persona persona);
    
    public void deletePersona(long id);
    
    public Persona findPersona(Long id);
}
