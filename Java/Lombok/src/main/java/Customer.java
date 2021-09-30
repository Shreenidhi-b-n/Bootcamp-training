import lombok.*;

//@Getter
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
public class Customer {
    @Getter
    private int custId;
    private String custName;
    private int balance;


}
