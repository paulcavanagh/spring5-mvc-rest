package guru.springfamework.api.v1.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDTO {

    private Long id;

    @ApiModelProperty(value = "This is the vendor Name", required = true)
    private String name;
    private String vendorUrl;
}
