package bg.softuni.campingcars.service;

import bg.softuni.campingcars.model.dto.bindingModels.BrandDTO;

import java.util.List;

public interface BrandService {

    List<BrandDTO> getAllBrands();
}
