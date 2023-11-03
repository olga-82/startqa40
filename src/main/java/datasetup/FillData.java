package datasetup;


import java.util.ArrayList;
import java.util.List;

public class FillData {

    List<DataCommonDTO> list = new ArrayList<>();

    public List<DataCommonDTO> getList() {
        return list;
    }

    public List<DataCommonDTO> fillData() {
        UserDTO userDTO =new UserDTO("email@tr32",6565);
        CarDTO carDTO1 =new CarDTO("model1",11111);
        CarDTO carDTO2 =new CarDTO("model2",22222);
        CarDTO[] cars ={carDTO1,carDTO2};
        DataCommonDTO dataCommonDTO =new DataCommonDTO(userDTO,cars);
        list.add(dataCommonDTO);

        // list.add/.......
        return list;
    }
}
