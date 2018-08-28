package guru.springframework.api.v1.mappers;

import guru.springfamework.api.v1.mapper.CustomerMapper;
import guru.springfamework.api.v1.model.CustomerDTO;
import guru.springfamework.domain.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerMapperTest {

    public static final String FIRST_NAME = "Paul";
    public static final String LAST_NAME = "Cavanagh";
    public static final long ID = 1L;

    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    public void customerTOCustomerDTO() throws Exception{

        //given
        Customer customer = new Customer();
        customer.setFirstName(FIRST_NAME);
        customer.setLastName(LAST_NAME);
        customer.setId(ID);

        //when
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        //then
        assertEquals(Long.valueOf(ID), customerDTO.getId());
        assertEquals(FIRST_NAME, customerDTO.getFirstName());
        assertEquals(LAST_NAME, customerDTO.getLastName());

    }



}
