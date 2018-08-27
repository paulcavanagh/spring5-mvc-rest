package guru.springfamework.api.v1.model;

import guru.springfamework.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CategoryListDTO {

    List<CategoryDTO> categories;
}
