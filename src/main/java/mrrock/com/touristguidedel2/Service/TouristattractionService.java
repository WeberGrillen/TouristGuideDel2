package mrrock.com.touristguidedel2.Service;



import mrrock.com.touristguidedel2.Model.Tags;

import mrrock.com.touristguidedel2.Model.Touristattraction;
import mrrock.com.touristguidedel2.Repository.TouristattractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

import java.util.List;
import java.util.UUID;

@Service
public class TouristattractionService {
    @Autowired
    private TouristattractionRepository touristattractionRepository;

    // GET Attraction By Name
    public Touristattraction getAttractionByName(String name){
        return touristattractionRepository.getAttractionByName(name);
    }

    // GET Attraction Tags
    public List<Tags> getAttractionsTags(String name) {
        List<Tags> listOfTags = touristattractionRepository.getAttractionsTags(name);
        return listOfTags;
    }
    // GET All Attractions
    public List<Touristattraction> getAllAttractions(){
       return touristattractionRepository.getAllAttractions();
    }
    // POST Save Attraction
    public Touristattraction saveAttraction(Touristattraction touristattraction){
        touristattractionRepository.saveAttraction(touristattraction);
        return touristattraction;
    }

    // POST Update Attraction
    public Touristattraction updateAttraction(Touristattraction touristattraction) {
        return touristattractionRepository.updateAttraction(touristattraction);
    }

    // POST Delete Attraction
    public Touristattraction deleteAttraction(String name) {
        return touristattractionRepository.deleteAttraction(name);
    }


}
