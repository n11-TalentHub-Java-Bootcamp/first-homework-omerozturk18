package entityservice;

import dao.ProductDao;
import dto.CountOfProductCommentsDto;
import dto.ProductDetailDto;
import entity.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductEntityService {

    private ProductDao productDao;

    public ProductEntityService() {
        productDao = new ProductDao();
    }

    public List<Product> findAll(){
        return productDao.findAll();
    }

    public Product findById(Long id){
        return productDao.findById(id);
    }

    public List<Product> findAllProductListByPriceGeAndPriceLe(BigDecimal fiyatGe, BigDecimal fiyatLe){
        return productDao.findAllProductListByPriceGeAndPriceLe(fiyatGe, fiyatLe);
    }

    public List<Product> findAllProductListByPriceBetween(BigDecimal fiyatGe, BigDecimal fiyatLe){
        return productDao.findAllProductListByPriceBetween(fiyatGe, fiyatLe);
    }

    public List<Product> findAllProductByCategoryBreaking(Long kirilim){
        return productDao.findAllProductByCategoryBreaking(kirilim);
    }

    public List<ProductDetailDto> findAllProductDetailDtoByCategoryBreaking(Long kirilim) {
        return productDao.findAllProductDetailDtoByCategoryBreaking(kirilim);
    }

    public List<CountOfProductCommentsDto> findAllCountOfProductComments() {
        return productDao.findAllCountOfProductComments();
    }
}