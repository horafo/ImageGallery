package ua.kiev.prog;

public interface BrandService {
    Brand getBrandById(long id);
    void addBrand(Brand brand);
    void updateBrand(Brand brand);
}

