package com.example.demo.bootstrap;

import com.example.demo.domain.Product;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //partRepository.deleteAll();
        //productRepository.deleteAll();

        if (partRepository.count() == 0 && productRepository.count() == 0) {
            // Add CPU part
            OutsourcedPart processor = new OutsourcedPart();
            processor.setCompanyName("Intel");
            processor.setName("CPU");
            processor.setInv(100);
            processor.setPrice(300);
            processor.setId(1001);
            processor.setMinInv(0);
            processor.setMaxInv(1000);
            outsourcedPartRepository.save(processor);

            // Add MOBO part
            OutsourcedPart motherboard = new OutsourcedPart();
            motherboard.setCompanyName("MSI");
            motherboard.setName("Motherboard");
            motherboard.setInv(100);
            motherboard.setPrice(200);
            motherboard.setId(1002);
            motherboard.setMinInv(0);
            motherboard.setMaxInv(1000);
            outsourcedPartRepository.save(motherboard);

            // Add RAM part
            OutsourcedPart memory = new OutsourcedPart();
            memory.setCompanyName("Corsair");
            memory.setName("RAM memory");
            memory.setInv(200);
            memory.setPrice(60);
            memory.setId(1003);
            memory.setMinInv(0);
            memory.setMaxInv(1000);
            outsourcedPartRepository.save(memory);

            // Add SSD part
            OutsourcedPart storage = new OutsourcedPart();
            storage.setCompanyName("Western Digital");
            storage.setName("Solid State Drive");
            storage.setInv(100);
            storage.setPrice(125);
            storage.setId(1004);
            storage.setMinInv(0);
            storage.setMaxInv(1000);
            outsourcedPartRepository.save(storage);

            // Add PSU part
            OutsourcedPart power = new OutsourcedPart();
            power.setCompanyName("Corsair");
            power.setName("Power Supply");
            power.setInv(100);
            power.setPrice(150);
            power.setId(1005);
            power.setMinInv(0);
            power.setMaxInv(1000);
            outsourcedPartRepository.save(power);

            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                System.out.println(part.getName()+" "+part.getCompanyName());
            }

            // Add Desktop Computer product
            Product desktopComp = new Product("Desktop Computer",900.0,20);
            productRepository.save(desktopComp);
            Product gamingComp = new Product("Gaming Computer",1250.0,20);
            productRepository.save(gamingComp);
            Product genLaptop = new Product("Generic Laptop", 700, 20);
            productRepository.save(genLaptop);
            Product gamingLaptop = new Product("Gaming Laptop", 1100.0,20);
            productRepository.save(gamingLaptop);
            Product linuxComp = new Product("Linux Computer",900.0,20);
            productRepository.save(linuxComp);


        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
