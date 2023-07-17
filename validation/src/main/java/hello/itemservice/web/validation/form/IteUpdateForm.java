package hello.itemservice.web.validation.form;


import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class IteUpdateForm {

    @NotNull
    private Long Id;

    @NotBlank
    private String itemName;

    @NotNull
    private Integer price;

    @NotNull
    @Max(value = 9999)
    private Integer quantity;

}
