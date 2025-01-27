# Record Class with Builder Pattern

This repository contains the `DriverRecord` Java record class, which demonstrates how to use the **Builder Pattern** to create immutable objects with complex configurations. The `Builder` subclass allows step-by-step construction of a `DriverRecord` while maintaining immutability and encapsulation.

## How the Builder Subclass Works

The `Builder` class is a static nested class, which means it does not require an instance of the `DriverRecord` class to be created. This ensures that a `DriverRecord` instance is not initialized until the `build()` method is explicitly called. This approach provides flexibility for constructing the object without committing to an immutable state.

### Key Features of the Builder:

1. **Step-by-Step Construction**:  
   Each method in the `Builder` returns the builder itself (via `return this`), allowing method chaining. This is akin to passing around a container that gets updated as it is passed from one step to the next.

2. **Finalizing the Object**:  
   Once all desired properties have been set, the `build()` method is called. This method takes the contents of the builder (the "container"), finalizes them, and constructs a new `DriverRecord` instance. The builder can then be discarded, as the data has been encapsulated within the immutable `DriverRecord`.

3. **Immutability**:  
   Since the `DriverRecord` is a record class, all its fields are immutable. The builder allows customization during the creation phase but ensures that once the object is created, it cannot be modified.

### Example Usage

```java
import org.example.DriverRecord;

public class Main {
    public static void main(String[] args) {
        DriverRecord driver = new DriverRecord.Builder()
                .firstName("John")
                .lastName("Doe")
                .dobMonth(1)
                .dobDay(15)
                .dobYear(1990)
                .licenseId("12345XYZ")
                .licenseAddress("123 Main St")
                .licenseCity("Louisville")
                .licenseState("KY")
                .licenseCountry("USA")
                .heightFeet(5)
                .heightInches(10)
                .licenseExpirationMonth(12)
                .licenseExpirationDay(31)
                .licenseExpirationYear(2030)
                .isActive(true)
                .isOrganDonor(false)
                .build();

        System.out.println(driver);
    }
}
