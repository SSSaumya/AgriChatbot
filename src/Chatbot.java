import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chatbot extends JFrame implements ActionListener {
    public JComboBox<String> cropComboBox;
    public JComboBox<String> aspectComboBox;
    public JButton submitButton;
    public JTextArea chatArea;

    public Chatbot() {
        setTitle("Agriculture Chatbot");
        setSize(600, 300); // Increased width to accommodate the image
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        // Chat area
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        // Crop ComboBox
        cropComboBox = new JComboBox<>(new String[]{ "Wheat", "Corn", "Rice", "Soybeans", "Barley",
                "Oats", "Potatoes", "Tomatoes", "Onions", "Garlic", "Ginger", "Green chilies", "Okra", "Eggplant", "Spinach",
                "Cauliflower", "Cabbage", "Carrots", "Green peas", "Bell peppers", "Bitter gourd", "Bottle gourd", "Ridge gourd",
                "Pumpkin", "Cucumber", "Fenugreek leaves", "Mangoes", "Bananas", "Oranges", "Apples", "Grapes", "Guavas",
                "Papayas", "Watermelons", "Pineapples", "Pomegranates", "Litchis", "Muskmelons", "Sapotas", "Custard Apples",
                "Jack fruits", "Kiwis", "Figs", "Indian Gooseberries (Amla)", "Jamuns (Java Plum)", "Sweet Lime"});
        cropComboBox.setBackground(Color.WHITE); // Set background color
        cropComboBox.setForeground(Color.BLACK); // Set text color
        cropComboBox.setPreferredSize(new Dimension(250, 50));
        add(cropComboBox, BorderLayout.NORTH);

        // Aspect ComboBox (Moved to the North after the cropComboBox)
        aspectComboBox = new JComboBox<>(new String[]{"Growth", "Watering", "Disease Prediction", "Fertilizer", "Organic Manure", "Suitable Season"});
        aspectComboBox.setBackground(Color.WHITE); // Set background color
        aspectComboBox.setForeground(Color.BLACK); // Set text color
        aspectComboBox.setPreferredSize(new Dimension(250, 50));
        JPanel northPanel = new JPanel(new FlowLayout()); // Panel to hold cropComboBox and aspectComboBox
        northPanel.add(cropComboBox);
        northPanel.add(new JLabel("Aspect: ")); // Optional label for clarity
        northPanel.add(aspectComboBox);
        add(northPanel, BorderLayout.NORTH);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        submitButton.setBackground(Color.GRAY); // Set background color
        submitButton.setForeground(Color.WHITE); // Set text color
        submitButton.setPreferredSize(new Dimension(100, 50));
        add(submitButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String selectedCrop = (String) cropComboBox.getSelectedItem();
            String selectedAspect = (String) aspectComboBox.getSelectedItem();
            String message = "You chose to inquire about " + selectedAspect.toLowerCase() + " of " + selectedCrop.toLowerCase() + ".";

            // Handle logic based on selected crop and aspect
            if (selectedCrop.equalsIgnoreCase("Wheat")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Wheat thrives in well-drained, fertile soil with a pH between 6.0 and 7.5. Choose a location with good air circulation and full sun for planting. Wheat is typically grown from seeds, which are sown directly into prepared soil. Plant seeds in rows with spacing of about 6-8 inches apart.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water wheat plants regularly, aiming to keep the soil consistently moist but not waterlogged. Wheat has moderate water requirements and is sensitive to drought stress during critical growth stages, such as tillering and grain filling. Supplemental irrigation may be necessary during dry periods.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common wheat diseases include powdery mildew, stripe rust, and Fusarium head blight. To prevent diseases, choose disease-resistant wheat varieties and practice crop rotation. Use clean seed and avoid planting wheat in fields with a history of disease outbreaks. Apply fungicides or other preventive treatments as needed according to local recommendations.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply fertilizer based on soil test results and nutrient requirements for wheat cultivation. Wheat has moderate nutrient requirements, particularly nitrogen and phosphorus. Apply nitrogen at planting and again at tillering to promote vegetative growth. Use phosphorus and potassium based on soil deficiencies.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter such as compost or well-rotted manure into the soil before planting wheat. Organic matter improves soil fertility, structure, and water retention, creating an ideal growing environment for wheat. Apply organic manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("pest control")) {
                    message = "Common wheat pests include aphids, cereal leaf beetles, and wheat midges. To control pests, monitor fields regularly for signs of infestation and use integrated pest management strategies. These may include cultural controls, biological controls, and chemical controls as a last resort.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest wheat when the grains have reached full maturity and the plants have turned golden brown. Test for ripeness by squeezing a few grains between your fingers; if they are hard and dry, the wheat is ready for harvest. Use a combine harvester to harvest wheat, adjusting settings to minimize grain loss and damage.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, pest control, or harvesting for wheat.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Rice")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Rice thrives in flooded or waterlogged soil, typically in paddies or fields with controlled irrigation. Choose a location with ample water supply and flat terrain for planting. Rice is typically grown from seeds, which are first germinated in a seedbed before transplanting into flooded fields.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Maintain consistent water levels in rice fields throughout the growing season. Rice plants require standing water, typically several inches deep, to grow. Flooding the fields prevents weeds from competing with rice plants for nutrients and reduces oxygen availability for weed seeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common rice diseases include blast, bacterial leaf blight, and sheath blight. To prevent diseases, choose disease-resistant rice varieties and practice crop rotation. Use clean seed and avoid planting rice in fields with a history of disease outbreaks. Apply fungicides or other preventive treatments as needed according to local recommendations.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply fertilizer based on soil test results and nutrient requirements for rice cultivation. Rice has high nitrogen requirements, particularly during the tillering and panicle initiation stages. Apply phosphorus and potassium based on soil deficiencies. Use slow-release fertilizers to provide nutrients over an extended period.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter such as compost or well-rotted manure into the soil before planting rice. Organic matter improves soil fertility, structure, and water retention, creating an ideal growing environment for rice. Apply organic manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("pest control")) {
                    message = "Common rice pests include rice stem borers, rice leafhoppers, and rice water weevils. To control pests, monitor fields regularly for signs of infestation and use integrated pest management strategies. These may include cultural controls, biological controls, and chemical controls as a last resort.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest rice when the grains have reached full maturity, typically indicated by a golden color and a hard texture. Drain the fields before harvesting, allowing the soil to dry to facilitate machinery operation. Use a combine harvester to harvest rice, adjusting settings to minimize grain loss and damage.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, pest control, or harvesting for rice.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Soybeans")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Soybeans thrive in well-drained, fertile soil with a pH between 6.0 and 7.0. Choose a sunny location for planting, as soybeans require full sun to produce optimal yields. Soybeans are typically grown from seeds. Plant seeds in rows with spacing of about 15-30 inches apart.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water soybean plants regularly, aiming to keep the soil consistently moist but not waterlogged. Soybeans have moderate water requirements and are sensitive to drought stress during flowering and pod development. Provide supplemental irrigation during dry periods to ensure adequate moisture.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common soybean diseases include soybean rust, sudden death syndrome, and phytophthora root rot. To prevent diseases, choose disease-resistant soybean varieties and plant them in well-drained soil with good air circulation. Practice crop rotation and avoid planting soybeans in fields with a history of soybean diseases.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost before planting to provide essential nutrients for soybean plants. Soybeans have moderate nutrient requirements, particularly nitrogen and phosphorus. Consider inoculating soybean seeds with rhizobia bacteria to enhance nitrogen fixation in the soil.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for soybean cultivation. Organic matter provides essential nutrients, improves soil structure, and enhances microbial activity, creating an ideal growing environment for soybeans. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("pest control")) {
                    message = "Common soybean pests include soybean aphids, bean leaf beetles, and pod borers. To control pests, monitor plants regularly for signs of infestation, such as yellowing leaves or damaged pods. Use integrated pest management strategies, including cultural controls, biological controls, and chemical controls as a last resort.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest soybeans when the pods are fully developed and have turned yellow or brown. Test for ripeness by squeezing a few pods; if mature seeds shatter easily, the soybeans are ready for harvest. Use a combine harvester to harvest soybeans, adjusting settings to minimize seed damage. Allow harvested soybeans to dry fully before storage.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, pest control, or harvesting for soybeans.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Barley")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Barley thrives in cool, temperate climates and well-drained soil with a pH between 6.0 and 7.5. Choose a sunny location for planting, although barley can tolerate partial shade. Barley is typically grown from seeds. Plant seeds in rows with spacing of about 6-12 inches apart.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water barley plants regularly, aiming to keep the soil consistently moist but not waterlogged. Barley has moderate water requirements and can tolerate periods of drought. Water deeply to encourage deep root growth, especially during periods of dry weather.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common barley diseases include powdery mildew, rust, and barley yellow dwarf virus. To prevent diseases, choose disease-resistant barley varieties and plant them in well-drained soil with good air circulation. Avoid planting barley in areas where barley or other grasses have been grown recently, as this can increase disease pressure.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost before planting to provide essential nutrients for barley plants. Barley has moderate nutrient requirements, particularly nitrogen and phosphorus. Side-dress with additional fertilizer or compost during the growing season to support vigorous growth and grain production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for barley cultivation. Organic matter provides essential nutrients, improves soil structure, and enhances microbial activity, creating an ideal growing environment for barley. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Barley is a cool-season crop and is best planted in early spring or late summer to early fall, depending on your climate. In areas with mild winters, barley can be planted in the fall for winter growth and harvested in the spring. In colder climates, barley is planted in early spring and harvested in late spring or early summer.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for barley.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Potatoes")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Growth: Potatoes grow best in loose, well-drained soil with a pH between 5.0 and 7.0. Sandy loam or loamy soils are ideal. Plant potatoes in trenches or mounds, spaced about 10-12 inches apart, and cover them with soil as they grow.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Watering: Potatoes require consistent moisture, especially during the tuber formation stage. Water deeply when the soil begins to dry out, ensuring even moisture but avoiding waterlogged conditions, which can lead to rot.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Disease Prediction: Common potato diseases include late blight, early blight, and potato scab. To prevent these, practice crop rotation, avoid planting potatoes in the same area for consecutive years, and ensure good air circulation by spacing plants adequately.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Fertilizers: Prior to planting, incorporate well-decomposed organic matter like compost or aged manure into the soil. During growth, apply balanced fertilizers with higher potassium content to promote tuber development.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Organic Manure: Compost or well-rotted manure can be applied before planting to improve soil structure and fertility, providing essential nutrients for healthy potato growth.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Suitable Season: Plant potatoes in cool seasons, ideally in late winter or early spring. In warmer climates, fall planting may be suitable.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for rice.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Oats")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Oats thrive in cool, moist climates and well-drained soil with a pH between 6.0 and 7.0. Choose a sunny location for planting, although oats can tolerate partial shade. Oats are typically grown from seeds. Plant seeds in rows with spacing of about 6-12 inches apart.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water oat plants regularly, aiming to keep the soil consistently moist but not waterlogged. Oats have moderate water requirements and can tolerate periods of drought. Water deeply to encourage deep root growth, especially during periods of dry weather.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common oat diseases include powdery mildew, rust, and crown rust. To prevent diseases, choose disease-resistant oat varieties and plant them in well-drained soil with good air circulation. Avoid planting oats in areas where oats or other grasses have been grown recently, as this can increase disease pressure.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost before planting to provide essential nutrients for oat plants. Oats have moderate nutrient requirements, particularly nitrogen and phosphorus. Side-dress with additional fertilizer or compost during the growing season to support vigorous growth and grain production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for oat cultivation. Organic matter provides essential nutrients, improves soil structure, and enhances microbial activity, creating an ideal growing environment for oats. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Oats are cool-season crops and are best planted in early spring or late summer to early fall, depending on your climate. In areas with mild winters, oats can be planted in the fall for winter growth and harvested in the spring. In colder climates, oats are planted in early spring and harvested in late spring or early summer.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for oats.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Tomatoes")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Growth: Tomatoes thrive in well-drained, fertile soil with a pH between 6.0 and 6.8. Choose a sunny location for planting. Tomatoes can be grown from seeds or seedlings, with proper spacing of about 18-24 inches between plants.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Watering: Water deeply and regularly, aiming to keep the soil consistently moist but not waterlogged. Avoid wetting the foliage to reduce the risk of fungal diseases.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Disease Prediction: Common tomato diseases include blight (early and late), blossom end rot, and powdery mildew. To prevent diseases, ensure good air circulation, practice crop rotation, mulch around plants to reduce soil splash, and avoid overhead watering.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Fertilizers: Use a balanced fertilizer with higher phosphorus and potassium content to promote flowering and fruiting. Avoid excessive nitrogen, which can lead to lush foliage at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Organic Manure: Prior to planting, amend the soil with compost or aged manure to improve soil fertility and structure. This provides essential nutrients and enhances soil health.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Suitable Season: Plant tomatoes after the last frost in spring. They prefer warm temperatures and need frost-free conditions to thrive.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for rice.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Onions")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Onions thrive in well-drained, fertile soil with a pH between 6.0 and 7.0. Choose a sunny location for planting, as onions require full sun to develop bulbs. Onions are typically grown from sets (small bulbs) or seeds. Plant sets or seeds in rows with spacing of about 4-6 inches between plants.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water onion plants regularly, aiming to keep the soil consistently moist but not waterlogged. Onions have shallow root systems, so frequent, shallow watering is preferable to deep watering. Provide supplemental irrigation during dry periods, especially during bulb formation.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common onion diseases include onion white rot, damping off, and onion downy mildew. To prevent diseases, choose disease-resistant onion varieties and plant them in well-drained soil with good air circulation. Practice proper sanitation by removing debris and avoiding overhead watering.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost before planting to provide essential nutrients for onion plants. Side-dress with additional fertilizer or compost during the growing season to support vigorous growth and bulb formation. Onions have moderate nutrient requirements, particularly nitrogen and potassium.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for onion cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances microbial activity, creating an ideal growing environment for onions. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("pest control")) {
                    message = "Common onion pests include onion thrips, onion maggots, and onion root maggots. To control pests, monitor plants regularly for signs of infestation, such as yellowing leaves or damaged bulbs. Use row covers to protect young plants from pests, and practice crop rotation to reduce pest pressure.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest onions when the tops turn yellow and begin to fall over. Gently lift the bulbs from the soil using a garden fork or trowel, taking care not to damage the bulbs. Cure onions by drying them in a warm, well-ventilated area for 2-3 weeks until the outer skins are papery. Trim the tops and roots before storing.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, pest control, or harvesting for onions.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Garlic")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Garlic grows best in well-drained, fertile soil with a pH between 6.0 and 7.0. Choose a sunny location for planting. Break apart cloves from the bulb a few days before planting, but keep the papery husk on each individual clove. Plant cloves pointed end up, 2-4 inches deep and 6-8 inches apart in rows spaced 12-18 inches apart. Water the cloves immediately after planting. Garlic requires consistent moisture, especially during the initial stages of growth, but avoid overwatering as garlic bulbs can rot in waterlogged soil.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Garlic requires consistent moisture, especially during bulb development. Water the garlic regularly, aiming to keep the soil consistently moist but not waterlogged. In general, garlic needs about 1 inch of water per week, either from rainfall or irrigation. Adjust watering frequency based on weather conditions; reduce watering as garlic approaches maturity to prevent rotting.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common garlic diseases include white rot, rust, downy mildew, and botrytis rot. To prevent diseases, plant garlic in well-drained soil with good air circulation. Practice crop rotation, avoid planting garlic in the same area for consecutive years. Ensure proper spacing between plants to reduce humidity levels and minimize the risk of fungal infections. If signs of disease appear, remove and destroy infected plants, and consider using disease-resistant garlic varieties.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Garlic is not heavy feeder, but it benefits from soil rich in organic matter. Prior to planting, incorporate compost or aged manure into the soil to improve soil fertility and structure. Additionally, you can apply a balanced fertilizer with a higher phosphorus content to promote root development and bulb formation. Side-dress with additional fertilizer during the growing season if necessary, but avoid excessive nitrogen which can stimulate excessive foliage growth at the expense of bulb development.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Compost or aged manure can be added to the soil before planting garlic to improve soil fertility and structure. Incorporate a 2-4 inch layer of compost or well-rotted manure into the planting area and mix it thoroughly with the soil. Organic matter provides essential nutrients, improves soil structure, and enhances moisture retention, creating an ideal growing environment for garlic.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Garlic can be planted in fall for overwintering or in early spring for spring planting. Fall planting allows the garlic to establish roots before winter dormancy and results in larger bulbs. In regions with mild winters, garlic can be planted in late winter or early spring for a summer harvest. Choose the planting time based on your local climate and the desired harvest season.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for garlic.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Ginger")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Ginger thrives in well-drained, rich soil with a pH between 6.0 and 6.8. Choose a sunny location for planting. Ginger is typically grown from rhizomes (roots), which should be planted in shallow furrows with the buds facing upwards. Cover the rhizomes lightly with soil. Keep the soil consistently moist but not waterlogged, especially during the growing season. Reduce watering as the plants approach maturity to avoid rotting.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water ginger plants regularly, aiming to keep the soil consistently moist but not waterlogged. Ginger requires adequate moisture, especially during the growing season, to support healthy growth. However, overwatering can lead to root rot and other fungal diseases. Adjust watering frequency based on weather conditions and soil moisture levels.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common ginger diseases include root rot and bacterial wilt. To prevent diseases, ensure well-drained soil, avoid overwatering, and practice crop rotation. Monitor plants regularly for signs of disease, such as yellowing leaves, wilting, or rotting roots. Remove and destroy infected plants promptly to prevent the spread of disease to neighboring plants.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for ginger plants. Choose a fertilizer with a higher phosphorus and potassium content to promote root development and rhizome formation. Side-dress with additional fertilizer during the growing season to support vigorous growth. Avoid excessive nitrogen, which can lead to lush foliage but fewer rhizomes.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for ginger cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for ginger. Compost or manure can be applied as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant ginger in spring or early summer, as it requires warm temperatures and a long growing season to mature. In colder climates, start ginger indoors and transplant it outdoors after the last frost. Choose a planting time that allows the ginger plants to establish before the onset of cold weather. Harvest ginger when the leaves turn yellow and start to dry.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for ginger.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Green Chilies")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Green chilies grow best in well-drained, loamy soil with a pH between 6.0 and 7.0. Choose a sunny location for planting, as chilies require plenty of sunlight. Green chilies can be grown from seeds or transplants. Plant seeds or transplants in rows with spacing of about 18-24 inches between plants. Keep the soil consistently moist but not waterlogged.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water green chili plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during flowering and fruiting stages. Avoid overhead watering to prevent foliar diseases. Mulch around plants to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common green chili diseases include damping-off, powdery mildew, and bacterial wilt. To prevent diseases, plant green chilies in well-drained soil with good air circulation. Practice crop rotation, avoid planting in the same area for consecutive years. Monitor plants regularly for signs of disease, such as wilting, yellowing leaves, or fungal growth. Remove and destroy infected plants promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for green chili plants. Choose a fertilizer with a higher phosphorus and potassium content to promote flowering and fruiting. Side-dress with additional fertilizer during the growing season to support vigorous growth. Avoid excessive nitrogen, which can lead to excessive foliage growth at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for green chilies cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for green chilies. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant green chili seeds or transplants after the last frost in spring, as they require warm temperatures to thrive. Green chilies can also be grown as a summer crop in warmer regions. Choose a planting time that allows the plants to establish before the onset of hot weather. Harvest green chilies when they reach the desired size and color.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for green chilies.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Spinach")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Spinach grows best in well-drained, loamy soil with a pH between 6.0 and 7.0. Choose a partially shaded location for planting, especially in warmer climates. Spinach can be grown from seeds or transplants. Plant seeds or transplants in rows with spacing of about 6-12 inches between plants. Keep the soil consistently moist but not waterlogged.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water spinach plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during leaf development. Avoid overhead watering to prevent foliar diseases. Mulch around plants to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common spinach diseases include downy mildew, powdery mildew, and damping-off. To prevent diseases, plant spinach in well-drained soil with good air circulation. Avoid overhead watering and overcrowding, which can create favorable conditions for fungal growth. Monitor plants regularly for signs of disease, such as yellowing leaves or fungal growth. Remove and destroy infected plants promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for spinach plants. Choose a fertilizer with a higher nitrogen content to promote leafy growth. Side-dress with additional fertilizer during the growing season to support vigorous growth. Avoid excessive nitrogen, which can lead to leafy but less flavorful spinach.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for spinach cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for spinach. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant spinach seeds or transplants in early spring for a cool-season crop or in late summer for a fall crop. Spinach prefers cooler temperatures and can bolt (go to seed) in hot weather. Choose a planting time that allows the plants to mature before the onset of hot weather. Harvest spinach leaves when they reach the desired size and before they start to bolt.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for spinach.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Eggplant")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Eggplants thrive in well-drained, fertile soil with a pH between 6.0 and 6.5. Choose a sunny location for planting, as eggplants require full sun to produce fruit. Eggplants can be grown from seeds or transplants. Plant seeds or transplants in rows with spacing of about 18-24 inches between plants. Keep the soil consistently moist but not waterlogged.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water eggplant plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during flowering and fruiting stages. Avoid overhead watering to prevent foliar diseases. Mulch around plants to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common eggplant diseases include verticillium wilt, fusarium wilt, and powdery mildew. To prevent diseases, plant eggplants in well-drained soil with good air circulation. Practice crop rotation, avoid planting in the same area for consecutive years. Monitor plants regularly for signs of disease, such as wilting, yellowing leaves, or fungal growth. Remove and destroy infected plants promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for eggplant plants. Choose a fertilizer with a higher phosphorus and potassium content to promote flowering and fruiting. Side-dress with additional fertilizer during the growing season to support vigorous growth. Avoid excessive nitrogen, which can lead to excessive foliage growth at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for eggplant cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for eggplants. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant eggplant seeds or transplants after the last frost in spring, as they require warm temperatures to thrive. Eggplants can also be grown as a summer crop in warmer regions. Choose a planting time that allows the plants to establish before the onset of hot weather. Harvest eggplants when they reach the desired size and color.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for eggplant.";
                }
            } else if (selectedCrop.equalsIgnoreCase("Okra")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Okra grows best in well-drained, fertile soil with a pH between 6.0 and 7.0...";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water okra regularly, aiming to keep the soil consistently moist but not waterlogged...";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common okra diseases include powdery mildew, root-knot nematodes, and bacterial wilt...";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer with higher phosphorus and potassium content to promote growth...";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or aged manure into the soil before planting to improve fertility...";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant okra after the last frost in spring, as it prefers warm temperatures...";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for okra.";
                }

        }else if (selectedCrop.equalsIgnoreCase("Cauliflower")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Cauliflower thrives in well-drained, fertile soil with a pH between 6.0 and 7.0. Choose a sunny location for planting, although cauliflower can tolerate partial shade in hotter climates. Cauliflower is typically grown from transplants rather than seeds. Plant transplants in rows with spacing of about 18-24 inches between plants. Keep the soil consistently moist.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water cauliflower plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during head formation. Avoid overhead watering to prevent foliar diseases. Mulch around plants to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common cauliflower diseases include clubroot, downy mildew, and black rot. To prevent diseases, plant cauliflower in well-drained soil with good air circulation. Practice crop rotation, avoid planting in the same area for consecutive years. Monitor plants regularly for signs of disease, such as yellowing leaves or fungal growth. Remove and destroy infected plants promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for cauliflower plants. Choose a fertilizer with a higher phosphorus content to promote head formation. Side-dress with additional fertilizer during the growing season to support vigorous growth. Avoid excessive nitrogen, which can lead to leafy but less compact heads.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for cauliflower cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for cauliflower. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant cauliflower transplants in early spring for a cool-season crop or in late summer for a fall crop. Cauliflower prefers cooler temperatures and can bolt (go to seed) in hot weather. Choose a planting time that allows the plants to mature before the onset of hot weather. Harvest cauliflower heads when they reach the desired size and before they start to open up.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for cauliflower.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Carrots")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Carrots prefer loose, well-drained soil with a pH between 6.0 and 6.8. Choose a sunny location for planting. Carrots can be grown from seeds directly sown into the ground. Plant seeds in shallow furrows, spacing them about 2 inches apart. Keep the soil consistently moist until germination occurs. Thin seedlings to 2-3 inches apart once they reach a height of 2 inches.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water carrot plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during root development. Avoid overhead watering to prevent foliar diseases. Mulch around plants to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common carrot diseases include carrot rust fly, powdery mildew, and damping-off. To prevent diseases, plant carrots in well-drained soil with good air circulation. Practice crop rotation, avoid planting carrots in the same area for consecutive years. Monitor plants regularly for signs of disease, such as yellowing leaves or fungal growth. Remove and destroy infected plants promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Carrots are light feeders and do not require much fertilizer. Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for carrot plants. Avoid excessive nitrogen, which can cause forked or hairy roots. Side-dress with additional fertilizer during the growing season only if necessary, but carrots generally do not need much additional feeding.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for carrot cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for carrots. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant carrot seeds directly into the ground in early spring for a spring crop or in late summer for a fall crop. Carrots prefer cooler temperatures and can tolerate light frosts. Choose a planting time that allows the carrots to mature before the onset of hot weather. Harvest carrots when they reach the desired size and color.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for carrots.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Green Peas")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Green peas prefer well-drained, loamy soil with a pH between 6.0 and 7.5. Choose a sunny location for planting, although green peas can tolerate partial shade in hotter climates. Green peas are typically grown from seeds. Plant seeds in rows with spacing of about 2-4 inches apart. Provide support such as trellises or stakes for climbing varieties.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water green pea plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during flowering and pod development. Avoid overhead watering to prevent foliar diseases. Mulch around plants to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common green pea diseases include powdery mildew, damping-off, and pea aphids. To prevent diseases, plant green peas in well-drained soil with good air circulation. Practice crop rotation, avoid planting in the same area for consecutive years. Monitor plants regularly for signs of disease, such as yellowing leaves or fungal growth. Remove and destroy infected plants promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Green peas are nitrogen-fixing legumes and do not require much additional fertilizer. Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for pea plants. Avoid excessive nitrogen, which can lead to lush foliage but fewer pods. Side-dress with additional fertilizer only if necessary, but green peas generally do not need much additional feeding.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for green pea cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for green peas. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant green pea seeds directly into the ground in early spring for a spring crop or in late summer for a fall crop. Green peas prefer cooler temperatures and can tolerate light frosts. Choose a planting time that allows the peas to mature before the onset of hot weather. Harvest green peas when the pods are well-filled and the peas are tender.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for green peas.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Bell Peppers")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Bell peppers thrive in well-drained, fertile soil with a pH between 6.0 and 6.8. Choose a sunny location for planting, as bell peppers require full sun to produce fruit. Bell peppers are typically grown from transplants rather than seeds. Plant transplants in rows with spacing of about 18-24 inches between plants. Keep the soil consistently moist.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water bell pepper plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during flowering and fruiting stages. Avoid overhead watering to prevent foliar diseases. Mulch around plants to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common bell pepper diseases include blossom end rot, bacterial spot, and powdery mildew. To prevent diseases, plant bell peppers in well-drained soil with good air circulation. Practice crop rotation, avoid planting in the same area for consecutive years. Monitor plants regularly for signs of disease, such as yellowing leaves or fungal growth. Remove and destroy infected plants promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for bell pepper plants. Choose a fertilizer with a higher phosphorus content to promote flowering and fruiting. Side-dress with additional fertilizer during the growing season to support vigorous growth. Avoid excessive nitrogen, which can lead to excessive foliage growth at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for bell pepper cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for bell peppers. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant bell pepper transplants after the last frost in spring, as they require warm temperatures to thrive. Bell peppers can also be grown as a summer crop in warmer regions. Choose a planting time that allows the plants to mature before the onset of hot weather. Harvest bell peppers when they reach the desired size and color.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for bell peppers.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Bitter Gourd")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Bitter gourd thrives in well-drained, sandy loam soil with a pH between 6.0 and 7.0. Choose a sunny location for planting, as bitter gourd requires full sun to produce fruit. Bitter gourd is typically grown from seeds. Plant seeds in hills or mounds spaced about 3-5 feet apart. Provide support such as trellises or stakes for climbing varieties.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water bitter gourd plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during flowering and fruiting stages. Avoid overhead watering to prevent foliar diseases. Mulch around plants to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common bitter gourd diseases include powdery mildew, damping-off, and anthracnose. To prevent diseases, plant bitter gourd in well-drained soil with good air circulation. Practice crop rotation, avoid planting in the same area for consecutive years. Monitor plants regularly for signs of disease, such as yellowing leaves or fungal growth. Remove and destroy infected plants promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for bitter gourd plants. Choose a fertilizer with a higher phosphorus content to promote flowering and fruiting. Side-dress with additional fertilizer during the growing season to support vigorous growth. Avoid excessive nitrogen, which can lead to excessive foliage growth at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for bitter gourd cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for bitter gourd. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant bitter gourd seeds after the last frost in spring, as they require warm temperatures to thrive. Bitter gourd can also be grown as a summer crop in warmer regions. Choose a planting time that allows the plants to mature before the onset of hot weather. Harvest bitter gourd when they reach the desired size and color.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for bitter gourd.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Bottle Gourd")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Bottle gourd thrives in well-drained, fertile soil with a pH between 6.0 and 7.5. Choose a sunny location for planting, as bottle gourd requires full sun to produce fruit. Bottle gourd is typically grown from seeds. Plant seeds in hills or mounds spaced about 3-5 feet apart. Provide support such as trellises or stakes for climbing varieties.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water bottle gourd plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during flowering and fruiting stages. Avoid overhead watering to prevent foliar diseases. Mulch around plants to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common bottle gourd diseases include powdery mildew, downy mildew, and damping-off. To prevent diseases, plant bottle gourd in well-drained soil with good air circulation. Practice crop rotation, avoid planting in the same area for consecutive years. Monitor plants regularly for signs of disease, such as yellowing leaves or fungal growth. Remove and destroy infected plants promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for bottle gourd plants. Choose a fertilizer with a higher phosphorus content to promote flowering and fruiting. Side-dress with additional fertilizer during the growing season to support vigorous growth. Avoid excessive nitrogen, which can lead to excessive foliage growth at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for bottle gourd cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for bottle gourd. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant bottle gourd seeds after the last frost in spring, as they require warm temperatures to thrive. Bottle gourd can also be grown as a summer crop in warmer regions. Choose a planting time that allows the plants to mature before the onset of hot weather. Harvest bottle gourd when they reach the desired size and color.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for bottle gourd.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Ridge Gourd")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Ridge gourd thrives in well-drained, fertile soil with a pH between 6.0 and 7.5. Choose a sunny location for planting, as ridge gourd requires full sun to produce fruit. Ridge gourd is typically grown from seeds. Plant seeds in hills or mounds spaced about 3-5 feet apart. Provide support such as trellises or stakes for climbing varieties.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water ridge gourd plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during flowering and fruiting stages. Avoid overhead watering to prevent foliar diseases. Mulch around plants to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common ridge gourd diseases include powdery mildew, downy mildew, and damping-off. To prevent diseases, plant ridge gourd in well-drained soil with good air circulation. Practice crop rotation, avoid planting in the same area for consecutive years. Monitor plants regularly for signs of disease, such as yellowing leaves or fungal growth. Remove and destroy infected plants promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for ridge gourd plants. Choose a fertilizer with a higher phosphorus content to promote flowering and fruiting. Side-dress with additional fertilizer during the growing season to support vigorous growth. Avoid excessive nitrogen, which can lead to excessive foliage growth at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for ridge gourd cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for ridge gourd. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant ridge gourd seeds after the last frost in spring, as they require warm temperatures to thrive. Ridge gourd can also be grown as a summer crop in warmer regions. Choose a planting time that allows the plants to mature before the onset of hot weather. Harvest ridge gourd when they reach the desired size and color.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for ridge gourd.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Cabbage")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Cabbage thrives in well-drained, fertile soil with a pH between 6.0 and 7.5. Choose a sunny location for planting, although cabbage can tolerate partial shade. Cabbage is typically grown from seeds or transplants. Plant seeds or transplants in rows with spacing of about 12-18 inches between plants. Keep the soil consistently moist.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water cabbage plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during head formation. Avoid overhead watering to prevent foliar diseases. Mulch around plants to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common cabbage diseases include clubroot, black rot, and cabbage worms. To prevent diseases, plant cabbage in well-drained soil with good air circulation. Practice crop rotation, avoid planting in the same area for consecutive years. Monitor plants regularly for signs of disease, such as wilting, yellowing leaves, or insect damage. Remove and destroy infected plants promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost at planting time to provide essential nutrients for cabbage plants. Choose a fertilizer with a higher nitrogen content to promote leafy growth. Side-dress with additional fertilizer during the growing season to support vigorous growth. Avoid excessive nitrogen, which can lead to loose heads or splitting.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for cabbage cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for cabbage. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Plant cabbage seeds or transplants in early spring for a spring crop or in late summer for a fall crop. Cabbage prefers cooler temperatures and can tolerate light frosts. Choose a planting time that allows the plants to mature before the onset of hot weather. Harvest cabbage heads when they reach the desired size and density.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for cabbage.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Apples")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Apples thrive in well-drained, loamy soil with a pH between 6.0 and 7.0. Choose a sunny location for planting, as apples require full sun to produce fruit. Apple trees are typically grown from grafted nursery stock rather than seeds. Plant trees in a location with good air circulation and adequate space for growth.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water apple trees regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during fruit development. Avoid overhead watering to prevent fungal diseases. Apply mulch around the base of trees to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common apple diseases include apple scab, powdery mildew, and fire blight. To prevent diseases, choose disease-resistant apple varieties and plant them in well-drained soil with good air circulation. Prune trees regularly to remove diseased or dead branches. Apply fungicides or other preventive treatments as needed according to local recommendations.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer formulated for fruit trees in early spring before new growth begins. Avoid excessive nitrogen, which can promote vegetative growth at the expense of fruit production. Follow the manufacturer's instructions for application rates. Consider soil testing to determine specific nutrient needs.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Apply compost or well-rotted manure around the base of apple trees in early spring before new growth begins. Organic matter provides essential nutrients, improves soil structure, and enhances microbial activity, creating a healthy root environment for apple trees. Avoid placing organic material directly against the tree trunk to prevent rot.";
                } else if (selectedAspect.equalsIgnoreCase("pruning")) {
                    message = "Prune apple trees annually during the dormant season to remove dead, diseased, or crossing branches. Open up the canopy to improve air circulation and sunlight penetration, which reduces the risk of fungal diseases. Train young trees to a desired shape, such as a central leader or modified central leader, and remove competing leaders.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest apples when they reach the desired size, color, and flavor. Different apple varieties ripen at different times, so monitor fruit maturity closely. Twist or lift the apple slightly; if it comes off easily from the tree with a twisting motion, it is ripe for harvest. Handle apples carefully to avoid bruising, and store them in a cool, humid place for best quality.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, pruning, or harvesting for apples.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Mangoes")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Mango trees thrive in well-drained, sandy or loamy soil with a pH between 5.5 and 7.5. Choose a sunny location for planting, as mangoes require full sun to produce fruit. Mango trees are typically grown from grafted nursery stock rather than seeds. Plant trees in a location with good air circulation and adequate space for growth.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water mango trees regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during flowering and fruit development. Deep watering is essential to encourage deep root growth. Apply mulch around the base of trees to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common mango diseases include anthracnose, powdery mildew, and bacterial black spot. To prevent diseases, choose disease-resistant mango varieties and plant them in well-drained soil with good air circulation. Prune trees regularly to remove diseased or dead branches. Apply fungicides or other preventive treatments as needed according to local recommendations.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer formulated for fruit trees in early spring before new growth begins. Follow the manufacturer's instructions for application rates. Consider using a slow-release fertilizer to provide nutrients over an extended period. Apply additional fertilizer in late spring and early summer to support fruit development.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Apply compost or well-rotted manure around the base of mango trees in early spring before new growth begins. Organic matter provides essential nutrients, improves soil structure, and enhances microbial activity, creating a healthy root environment for mango trees. Avoid placing organic material directly against the tree trunk to prevent rot.";
                } else if (selectedAspect.equalsIgnoreCase("pruning")) {
                    message = "Prune mango trees annually during the dormant season to remove dead, diseased, or crossing branches. Open up the canopy to improve air circulation and sunlight penetration, which reduces the risk of fungal diseases. Remove any suckers growing from below the graft union. Prune to maintain a balanced tree shape and encourage fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest mangoes when they reach the desired size, color, and flavor. Different mango varieties ripen at different times, so monitor fruit maturity closely. For most varieties, mangoes can be harvested once they have developed their full color and are slightly soft to the touch. Handle mangoes carefully to avoid bruising, and store them at room temperature to ripen fully.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, pruning, or harvesting for mangoes.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Pumpkins")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Growth: Pumpkins prefer well-drained, fertile soil with a pH between 6.0 and 7.5. Choose a sunny location for planting. Pumpkin seeds can be sown directly into the garden bed or started indoors and transplanted.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Watering: Water pumpkin plants regularly, aiming to keep the soil consistently moist but not waterlogged. Mulch around the plants to retain moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Disease Prediction: Common pumpkin diseases include powdery mildew, downy mildew, and bacterial wilt. To prevent diseases, ensure good air circulation, practice crop rotation, and avoid overhead watering.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Fertilizers: Apply a balanced fertilizer with higher phosphorus and potassium content to promote flowering and fruiting. Side-dress with additional fertilizer during the growing season if necessary.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Organic Manure: Prior to planting, incorporate compost or aged manure into the soil to improve soil fertility and structure. This provides essential nutrients and enhances soil health.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Suitable Season: Plant pumpkin seeds after the last frost in spring or during the warm season. They prefer hot temperatures and need frost-free conditions to thrive.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for rice.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Fenugreek leaves")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Growth: Fenugreek leaves, also known as methi, prefer well-drained, fertile soil with a pH between 6.0 and 7.0. Choose a partially shaded location for planting. Fenugreek seeds can be sown directly into the garden bed or in containers.\\n\" ";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Watering: Water fenugreek plants regularly, aiming to keep the soil consistently moist but not waterlogged. Avoid over watering, as it can lead to root rot.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Disease Prediction: Common fenugreek diseases include damping-off, powdery mildew, and downy mildew. To prevent diseases, ensure good air circulation, practice crop rotation, and avoid overcrowding plants.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Fertilizers: Fenugreek is a light feeder and does not require heavy fertilization. Incorporate compost or well-rotted manure into the soil before planting to provide essential nutrients.\n";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Organic Manure: Compost or aged manure can be added to the soil before planting to improve soil fertility and structure, providing essential nutrients for healthy fenugreek growth.\n";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Suitable Season: Plant fenugreek seeds in early spring or late summer for a fall harvest. Fenugreek prefers cool temperatures and can tolerate light frosts.\n" ;
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for rice.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Grapes")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Grapes thrive in well-drained, sandy or loamy soil with a pH between 6.0 and 7.0. Choose a sunny location for planting, as grapes require full sun to produce fruit. Grapes are typically grown from dormant bare-root vines or cuttings rather than seeds. Plant vines in rows with spacing of about 6-10 feet apart.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water grapevines regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during flowering and fruit development. Deep watering is essential to encourage deep root growth. Avoid overhead watering to prevent fungal diseases.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common grape diseases include powdery mildew, downy mildew, and black rot. To prevent diseases, plant disease-resistant grape varieties and provide good air circulation around the vines. Practice proper sanitation by removing fallen leaves and fruit from the ground. Apply fungicides or other preventive treatments as needed according to local recommendations.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer formulated for grapes in early spring before bud break. Follow the manufacturer's instructions for application rates. Consider using a slow-release fertilizer to provide nutrients over an extended period. Avoid excessive nitrogen, which can promote vegetative growth at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Apply compost or well-rotted manure around the base of grapevines in early spring before bud break. Organic matter provides essential nutrients, improves soil structure, and enhances microbial activity, creating a healthy root environment for grapevines. Avoid placing organic material directly against the vine trunk to prevent rot.";
                } else if (selectedAspect.equalsIgnoreCase("pruning")) {
                    message = "Prune grapevines annually during the dormant season to remove dead, diseased, or crossing branches. Train vines to a desired trellis system, such as a single or double cordon, and remove excess shoots to maintain a balanced canopy. Prune to improve air circulation and sunlight penetration, which reduces the risk of fungal diseases.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest grapes when they reach the desired color, flavor, and sugar content. Different grape varieties ripen at different times, so monitor fruit maturity closely. Grapes are typically harvested in late summer or early fall. Cut clusters from the vine with sharp pruning shears, leaving a short stem attached. Handle grapes carefully to avoid bruising.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, pruning, or harvesting for grapes.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Guavas")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Guavas thrive in well-drained, sandy loam soil with a pH between 5.0 and 7.0. Choose a sunny location for planting, as guavas require full sun to produce fruit. Guava trees are typically grown from seeds or cuttings. Plant trees in a location with good air circulation and protection from strong winds.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water guava trees regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during flowering and fruit development. Deep watering is essential to encourage deep root growth. Apply mulch around the base of trees to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common guava diseases include anthracnose, powdery mildew, and root rot. To prevent diseases, choose disease-resistant guava varieties and plant them in well-drained soil with good air circulation. Practice proper sanitation by removing fallen leaves and fruit from the ground. Apply fungicides or other preventive treatments as needed according to local recommendations.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer formulated for fruit trees in early spring before new growth begins. Follow the manufacturer's instructions for application rates. Consider using a slow-release fertilizer to provide nutrients over an extended period. Apply additional fertilizer in late spring and early summer to support fruit development.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Apply compost or well-rotted manure around the base of guava trees in early spring before new growth begins. Organic matter provides essential nutrients, improves soil structure, and enhances microbial activity, creating a healthy root environment for guava trees. Avoid placing organic material directly against the tree trunk to prevent rot.";
                } else if (selectedAspect.equalsIgnoreCase("pruning")) {
                    message = "Prune guava trees annually during the dormant season to remove dead, diseased, or crossing branches. Open up the canopy to improve air circulation and sunlight penetration, which reduces the risk of fungal diseases. Remove any suckers growing from below the graft union. Prune to maintain a balanced tree shape and encourage fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest guavas when they reach the desired size, color, and flavor. Guavas are typically harvested when they start to soften slightly and develop a fragrant aroma. Twist or cut the fruit from the tree with a sharp knife. Handle guavas carefully to avoid bruising, and store them at room temperature to ripen fully.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, pruning, or harvesting for guavas.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Oranges")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Oranges thrive in well-drained, sandy loam soil with a pH between 6.0 and 7.0. Choose a sunny location for planting, as oranges require full sun to produce fruit. Orange trees are typically grown from grafted nursery stock rather than seeds. Plant trees in a location with good air circulation and adequate space for growth.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water orange trees regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during fruit development. Deep watering is essential to encourage deep root growth. Apply mulch around the base of trees to retain soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common orange diseases include citrus greening (HLB), citrus canker, and citrus black spot. To prevent diseases, choose disease-resistant orange varieties and plant them in well-drained soil with good air circulation. Practice proper sanitation by removing fallen leaves and fruit from the ground. Apply fungicides or other preventive treatments as needed according to local recommendations.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer formulated for citrus trees in early spring before new growth begins. Follow the manufacturer's instructions for application rates. Consider using a slow-release fertilizer to provide nutrients over an extended period. Avoid excessive nitrogen, which can promote vegetative growth at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Apply compost or well-rotted manure around the base of orange trees in early spring before new growth begins. Organic matter provides essential nutrients, improves soil structure, and enhances microbial activity, creating a healthy root environment for orange trees. Avoid placing organic material directly against the tree trunk to prevent rot.";
                } else if (selectedAspect.equalsIgnoreCase("pruning")) {
                    message = "Prune orange trees annually during the dormant season to remove dead, diseased, or crossing branches. Open up the canopy to improve air circulation and sunlight penetration, which reduces the risk of fungal diseases. Remove any suckers growing from below the graft union. Prune to maintain a balanced tree shape and encourage fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest oranges when they reach the desired size, color, and flavor. Different orange varieties ripen at different times, so monitor fruit maturity closely. For most varieties, oranges can be harvested once they have fully developed their color and are easy to detach from the tree with a gentle twist. Handle oranges carefully to avoid bruising, and store them in a cool, ventilated area for best quality.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, pruning, or harvesting for oranges.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Cucumber")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Growth: Cucumbers prefer well-drained, fertile soil with a pH between 6.0 and 7.5. Choose a sunny location for planting. Cucumber seeds can be sown directly into the garden bed or started indoors and transplanted.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Watering: Water cucumber plants regularly, aiming to keep the soil consistently moist but not waterlogged. Mulch around the plants to retain moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Disease Prediction: Common cucumber diseases include powdery mildew, downy mildew, and cucumber mosaic virus. To prevent diseases, ensure good air circulation, practice crop rotation, and avoid overhead watering.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Fertilizers: Apply a balanced fertilizer with higher nitrogen content to promote vigorous vine growth and fruit production. Side-dress with additional fertilizer during the growing season if necessary.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Organic Manure: Prior to planting, incorporate compost or aged manure into the soil to improve soil fertility and structure. This provides essential nutrients and enhances soil health.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Suitable Season: Plant cucumber seeds after the last frost in spring or during the warm season. They prefer hot temperatures and need frost-free conditions to thrive.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for rice.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Watermelons")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Watermelons thrive in well-drained, sandy or loamy soil with a pH between 6.0 and 6.8. Choose a sunny location for planting, as watermelons require full sun to produce fruit. Watermelons are typically grown from seeds. Plant seeds in hills or mounds spaced about 6 feet apart in rows spaced 6 to 10 feet apart.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water watermelon plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide deep, infrequent watering to encourage deep root growth. Watermelons require consistent moisture, especially during flowering, fruit set, and fruit development stages. Avoid overhead watering to prevent fungal diseases.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common watermelon diseases include powdery mildew, downy mildew, and anthracnose. To prevent diseases, plant disease-resistant watermelon varieties and provide good air circulation around the plants. Avoid planting watermelons in the same location every year and practice crop rotation. Apply fungicides or other preventive treatments as needed according to local recommendations.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost before planting to provide essential nutrients for watermelon plants. Watermelons have high nutrient requirements, particularly nitrogen, phosphorus, and potassium. Side-dress with additional fertilizer or compost during the growing season to support vigorous growth and fruit development.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for watermelon cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances moisture retention, creating an ideal growing environment for watermelons. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("pollination")) {
                    message = "Watermelon flowers require pollination to set fruit. Bees are the primary pollinators of watermelon plants. Encourage bee activity in your garden by planting bee-friendly flowers and avoiding the use of pesticides that harm bees. If bee activity is low, consider hand-pollinating watermelon flowers by transferring pollen from male to female flowers using a small brush.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest watermelons when they reach full size and develop a dull, matte appearance on the underside. The tendril nearest to the fruit will turn brown and dry out when the watermelon is ripe. Cut the fruit from the vine using sharp pruning shears or a knife, leaving a short stem attached. Handle watermelons carefully to avoid bruising, and store them in a cool, dry place.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, pollination, or harvesting for watermelons.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Pineapples")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Pineapples thrive in well-drained, sandy soil with a pH between 5.5 and 6.5. Choose a sunny location for planting, as pineapples require full sun to produce fruit. Pineapples are typically grown from the tops of mature fruits or from suckers. Plant pineapple tops or suckers in a location with good drainage.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water pineapple plants regularly, aiming to keep the soil consistently moist but not waterlogged. Provide supplemental irrigation during dry periods, especially during fruit development. Pineapples have shallow root systems, so frequent, shallow watering is preferable to deep watering.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common pineapple diseases include fusarium wilt, root rot, and pineapple mealybug. To prevent diseases, plant disease-resistant pineapple varieties and provide good air circulation around the plants. Avoid planting pineapples in waterlogged soil and practice proper sanitation by removing dead leaves and debris.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer formulated for fruiting plants every 2-3 months during the growing season. Use a fertilizer with a higher potassium content to promote flowering and fruit development. Avoid excessive nitrogen, which can lead to excessive foliage growth at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for pineapple cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances microbial activity, creating an ideal growing environment for pineapples. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("propagation")) {
                    message = "Pineapples can be propagated from the tops of mature fruits or from suckers produced by mature plants. To propagate from tops, twist off the leafy crown from a ripe pineapple fruit and remove any excess flesh from the base. Allow the crown to dry for a few days, then plant it in well-drained soil with the base slightly buried.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest pineapples when they reach full size and develop a golden color. Test for ripeness by gently pulling on the center leaves; if they come out easily, the pineapple is ripe. Cut the fruit from the plant using a sharp knife, leaving a short stem attached. Handle pineapples carefully to avoid bruising, and store them at room temperature.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, propagation, or harvesting for pineapples.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Papayas")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Papayas thrive in well-drained, sandy or loamy soil with a pH between 6.0 and 7.0. Choose a sunny location for planting, as papayas require full sun to produce fruit. Papayas are typically grown from seeds. Plant seeds in a location protected from strong winds and with good drainage.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Water papaya plants regularly, aiming to keep the soil consistently moist but not waterlogged. Papayas have shallow root systems, so frequent, shallow watering is preferable to deep watering. Provide supplemental irrigation during dry periods, especially during fruit development.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common papaya diseases include papaya ringspot virus, powdery mildew, and phytophthora fruit rot. To prevent diseases, choose disease-resistant papaya varieties and plant them in well-drained soil with good air circulation. Practice proper sanitation by removing fallen leaves and fruit from the ground.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Apply a balanced fertilizer or organic compost every 2-3 months during the growing season. Use a fertilizer with a higher potassium content to promote flowering and fruit development. Avoid excessive nitrogen, which can lead to excessive foliage growth at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate compost or well-rotted manure into the soil before planting to improve soil fertility and structure for papaya cultivation. Organic matter provides essential nutrients, improves soil drainage, and enhances microbial activity, creating an ideal growing environment for papayas. Apply compost or manure as a top dressing during the growing season to replenish soil nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("pollination")) {
                    message = "Papaya flowers are typically pollinated by wind or insects. To encourage natural pollination, avoid using pesticides that harm pollinators and provide a habitat for beneficial insects. If necessary, hand-pollinate papaya flowers by transferring pollen from male to female flowers using a small brush or cotton swab.";
                } else if (selectedAspect.equalsIgnoreCase("harvesting")) {
                    message = "Harvest papayas when they reach full size and develop a yellow or orange color. Test for ripeness by gently pressing the fruit; if it yields slightly, it is ripe. Cut the fruit from the plant using a sharp knife, leaving a short stem attached. Handle papayas carefully to avoid bruising, and store them at room temperature to ripen fully.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, pollination, or harvesting for papayas.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Jackfruits")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Jackfruit trees thrive in tropical climates with warm temperatures and high humidity. They prefer well-drained, fertile soil with a pH range of 5.5 to 7.0. Plant young trees in a sunny location protected from strong winds.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Jackfruit trees require regular watering, especially during the dry season and fruit development. Provide deep watering to saturate the root zone, and then allow the soil to dry slightly before watering again. Avoid waterlogged conditions, as it can lead to root rot.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common diseases affecting Jackfruit trees include anthracnose, powdery mildew, and root rot. Practice good sanitation by removing fallen leaves and fruit debris to reduce disease incidence. Apply fungicides preventively during the growing season to protect against fungal infections.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Jackfruit trees have moderate fertilizer requirements. Apply a balanced fertilizer with a higher ratio of potassium (K) during the growing season to promote healthy growth and fruit development. Avoid excessive nitrogen, which can lead to delayed fruiting.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter such as compost or well-rotted manure into the soil around Jackfruit trees to improve soil fertility, structure, and moisture retention. Apply organic mulch around the base of the tree to suppress weeds, conserve soil moisture, and provide a steady supply of nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Jackfruit trees are typically planted in spring or early summer when the soil temperature is warm and frost risk has passed. Choose a site with good drainage and full sunlight for optimal growth and fruit production.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for Jackfruits.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Kiwis")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Kiwi vines thrive in temperate climates with mild winters and cool summers. They prefer well-drained, fertile soil with a pH range of 5.5 to 7.0. Plant young vines in a sunny location with good air circulation.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Kiwis require regular watering, especially during the growing season and fruit development. Provide deep watering to saturate the root zone, and then allow the soil to dry slightly before watering again. Avoid overwatering, as it can lead to root rot.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common diseases affecting kiwi vines include bacterial canker, powdery mildew, and gray mold. Practice good sanitation by removing infected plant parts and providing adequate air circulation. Apply fungicides preventively during the growing season to protect against fungal infections.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Kiwis have moderate fertilizer requirements. Apply a balanced fertilizer with a higher ratio of nitrogen (N) and potassium (K) during the growing season to promote healthy growth and fruit development. Avoid excessive nitrogen, which can lead to excessive vegetative growth.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter such as compost or well-rotted manure into the soil around kiwi vines to improve soil fertility, structure, and moisture retention. Apply organic mulch around the base of the vines to suppress weeds, conserve soil moisture, and provide a steady supply of nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Kiwis are typically planted in spring when the soil temperature is warm and frost risk has passed. Choose a site with good drainage and full sunlight for optimal growth and fruit production.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for Kiwis.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Indian Gooseberries (Amla)")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Indian Gooseberry trees thrive in subtropical to tropical climates with hot summers and mild winters. They prefer well-drained, slightly acidic soil with a pH range of 5.5 to 7.5. Plant young trees in a sunny location protected from strong winds.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Indian Gooseberry trees require regular watering, especially during the dry season and fruit development. Provide deep watering to saturate the root zone, and then allow the soil to dry slightly before watering again. Avoid waterlogged conditions, as it can lead to root rot.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common diseases affecting Indian Gooseberry trees include anthracnose, powdery mildew, and leaf spot. Practice good sanitation by removing fallen leaves and fruit debris to reduce disease incidence. Apply fungicides preventively during the growing season to protect against fungal infections.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Indian Gooseberry trees have low to moderate fertilizer requirements. Apply a balanced fertilizer with a higher ratio of nitrogen (N) and potassium (K) during the growing season to promote healthy growth and fruit development. Avoid excessive nitrogen, which can lead to excessive vegetative growth.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter such as compost or well-rotted manure into the soil around Indian Gooseberry trees to improve soil fertility, structure, and moisture retention. Apply organic mulch around the base of the tree to suppress weeds, conserve soil moisture, and provide a steady supply of nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Indian Gooseberry trees are typically planted in spring or early summer when the soil temperature is warm and frost risk has passed. Choose a site with good drainage and full sunlight for optimal growth and fruit production.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for Indian Gooseberries (Amla).";
                }
            }
            else if (selectedCrop.equalsIgnoreCase("Sapotas")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Sapota trees thrive in warm tropical climates with mild winters. They prefer well-drained, sandy loam soil with a pH range of 6.0 to 7.5. Plant young trees in a sunny location protected from strong winds.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Sapota trees require regular watering, especially during the dry season and fruit development. Provide deep watering to saturate the root zone, and then allow the soil to dry slightly before watering again. Avoid waterlogged conditions, as it can lead to root rot.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common diseases affecting Sapota trees include powdery mildew, anthracnose, and fruit rot. Practice good sanitation by removing fallen leaves and fruit debris to reduce disease incidence. Apply fungicides preventively during the growing season to protect against fungal infections.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Sapota trees have low to moderate fertilizer requirements. Apply a balanced fertilizer with a higher ratio of potassium (K) during the fruiting stage to promote fruit development and quality. Avoid excessive nitrogen, which can lead to delayed fruiting and poor fruit quality.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter such as compost or well-rotted manure into the soil around Sapota trees to improve soil fertility, structure, and moisture retention. Apply organic mulch around the base of the tree to suppress weeds, conserve soil moisture, and provide a steady supply of nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Sapota trees are typically planted in spring or early summer when the soil temperature is warm and frost risk has passed. Choose a site with good drainage and full sunlight for optimal growth and fruit production.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for Sapotas.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Figs")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Fig trees thrive in warm, Mediterranean-like climates with long, hot summers and mild winters. They prefer well-drained soil with a pH range of 6.0 to 6.5. Plant young trees in a sunny location protected from strong winds.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Fig trees require regular watering, especially during the dry season and fruit development. Provide deep watering to saturate the root zone, and then allow the soil to dry slightly before watering again. Avoid waterlogged conditions, as it can lead to root rot.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common diseases affecting Fig trees include fig mosaic virus, fig rust, and root rot. Practice good sanitation by removing fallen leaves and fruit debris to reduce disease incidence. Apply fungicides preventively during the growing season to protect against fungal infections.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Fig trees have low to moderate fertilizer requirements. Apply a balanced fertilizer with a higher ratio of phosphorus (P) and potassium (K) during the growing season to promote healthy growth and fruit development. Avoid excessive nitrogen, which can lead to excessive vegetative growth.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter such as compost or well-rotted manure into the soil around Fig trees to improve soil fertility, structure, and moisture retention. Apply organic mulch around the base of the tree to suppress weeds, conserve soil moisture, and provide a steady supply of nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Fig trees are typically planted in spring or early summer when the soil temperature is warm and frost risk has passed. Choose a site with good drainage and full sunlight for optimal growth and fruit production.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for Figs.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Litchis")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Litchi trees thrive in subtropical to tropical climates with high humidity. They prefer well-drained, slightly acidic soil with a pH range of 5.5 to 7.5. Plant young trees in a sunny location protected from strong winds.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Litchi trees require regular watering, especially during the dry season and fruit development. Provide deep watering to saturate the root zone, and then allow the soil to dry slightly before watering again. Avoid waterlogged conditions, as it can lead to root rot.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common diseases affecting Litchi trees include anthracnose, powdery mildew, and fruit rot. Practice good sanitation by removing fallen leaves and fruit debris to reduce disease incidence. Apply fungicides preventively during the growing season to protect against fungal infections.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Litchi trees have moderate fertilizer requirements. Apply a balanced fertilizer with a higher ratio of phosphorus (P) and potassium (K) during the growing season to promote vegetative growth and fruit development. Avoid excessive nitrogen, which can lead to delayed fruiting.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter such as compost or well-rotted manure into the soil around Litchi trees to improve soil fertility, structure, and moisture retention. Apply organic mulch around the base of the tree to suppress weeds, conserve soil moisture, and provide a steady supply of nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Litchi trees are typically planted in spring or early summer when the soil temperature is warm and frost risk has passed. Choose a site with good drainage and full sunlight for optimal growth and fruit production.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for Litchis.";
                }
            }else if (selectedCrop.equalsIgnoreCase("Custard Apples")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Custard Apple trees thrive in warm tropical climates with mild winters. They prefer well-drained, slightly acidic soil with a pH range of 6.0 to 7.5. Plant young trees in a sunny location protected from strong winds.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Custard Apple trees require regular watering, especially during the dry season and fruit development. Provide deep watering to saturate the root zone, and then allow the soil to dry slightly before watering again. Avoid waterlogged conditions, as it can lead to root rot.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common diseases affecting Custard Apple trees include anthracnose, powdery mildew, and fruit rot. Practice good sanitation by removing fallen leaves and fruit debris to reduce disease incidence. Apply fungicides preventively during the growing season to protect against fungal infections.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Custard Apple trees have moderate fertilizer requirements. Apply a balanced fertilizer with a higher ratio of potassium (K) during the flowering and fruiting stages to promote fruit development and quality. Avoid excessive nitrogen, which can lead to vegetative growth at the expense of fruiting.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter such as compost or well-rotted manure into the soil around Custard Apple trees to improve soil fertility, structure, and moisture retention. Apply organic mulch around the base of the tree to suppress weeds, conserve soil moisture, and provide a steady supply of nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Custard Apple trees are typically planted in spring or early summer when the soil temperature is warm and frost risk has passed. Choose a site with good drainage and full sunlight for optimal growth and fruit production.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for Custard Apples.";
                }
            } else if (selectedCrop.equalsIgnoreCase("Sweet Lime")) {
            if (selectedAspect.equalsIgnoreCase("growth")) {
                message = "Sweet Lime trees thrive in warm subtropical to tropical climates with mild winters. They prefer well-drained, slightly acidic soil with a pH range of 6.0 to 7.5. Plant young trees in a sunny location protected from strong winds.";
            } else if (selectedAspect.equalsIgnoreCase("watering")) {
                message = "Sweet Lime trees require regular watering, especially during the dry season and fruit development. Provide deep watering to saturate the root zone, and then allow the soil to dry slightly before watering again. Avoid waterlogged conditions, as it can lead to root rot.";
            } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                message = "Common diseases affecting Sweet Lime trees include citrus canker, powdery mildew, and fruit rot. Practice good sanitation by removing fallen leaves and fruit debris to reduce disease incidence. Apply fungicides preventively during the growing season to protect against fungal infections.";
            } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                message = "Sweet Lime trees have moderate fertilizer requirements. Apply a balanced fertilizer with a higher ratio of nitrogen (N) during the growing season to promote vegetative growth and fruit development. Avoid excessive nitrogen, which can lead to delayed fruiting and increased susceptibility to diseases.";
            } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                message = "Incorporate organic matter such as compost or well-rotted manure into the soil around Sweet Lime trees to improve soil fertility, structure, and moisture retention. Apply organic mulch around the base of the tree to suppress weeds, conserve soil moisture, and provide a steady supply of nutrients.";
            } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                message = "Sweet Lime trees are typically planted in spring or early summer when the soil temperature is warm and frost risk has passed. Choose a site with good drainage and full sunlight for optimal growth and fruit production.";
            } else {
                message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for Sweet Lime.";
            }
        }else if (selectedCrop.equalsIgnoreCase("Jamuns (Java Plum)")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Java Plum trees prefer tropical to subtropical climates and thrive in regions with hot summers and mild winters. They grow best in well-drained, slightly acidic soil with a pH range of 5.5 to 6.5. Plant young trees in a sunny location protected from strong winds.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Java Plum trees require regular watering, especially during the dry season and fruit development. Provide deep watering to saturate the root zone, and then allow the soil to dry slightly before watering again. Avoid waterlogged conditions, as it can lead to root rot.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common diseases affecting Java Plum trees include anthracnose, powdery mildew, and fruit rot. Practice good sanitation by removing fallen leaves and fruit debris to reduce disease incidence. Apply fungicides preventively during the growing season to protect against fungal infections.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Java Plum trees have moderate fertilizer requirements. Apply a balanced fertilizer with a higher ratio of nitrogen (N) during the growing season to promote vegetative growth and fruit development. Avoid excessive nitrogen, which can delay fruiting and make the tree more susceptible to diseases.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter such as compost or well-rotted manure into the soil around Java Plum trees to improve soil fertility, structure, and moisture retention. Apply organic mulch around the base of the tree to suppress weeds, conserve soil moisture, and provide a steady supply of nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Java Plum trees are typically planted in spring or early summer when the soil temperature is warm and frost risk has passed. Choose a site with good drainage and full sunlight for optimal growth and fruit production.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for Jamuns (Java Plum).";
                }
            }else if (selectedCrop.equalsIgnoreCase("Pomegranates")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Pomegranate trees thrive in well-drained soil and full sunlight. They prefer slightly acidic to alkaline soil with a pH range of 5.5 to 7.5. The ideal temperature for growth is between 65°F to 85°F (18°C to 29°C). Proper pruning and spacing are essential to promote healthy growth and fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Pomegranate trees require regular watering, especially during the growing season and fruit development. Provide deep watering to saturate the root zone, and then allow the soil to dry slightly before watering again. Avoid waterlogged conditions, as pomegranates are susceptible to root rot.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common diseases affecting pomegranate trees include bacterial blight, powdery mildew, and fruit rot. Monitor the trees regularly for signs of disease, such as leaf spots, wilting, or fruit discoloration. Implement preventive measures such as proper sanitation, using disease-resistant varieties, and applying fungicides when necessary.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Pomegranate trees benefit from balanced fertilization. Apply a fertilizer with a balanced ratio of nitrogen, phosphorus, and potassium (NPK) in early spring before new growth begins. Use organic compost or well-aged manure to improve soil fertility and structure. Avoid excessive nitrogen, which can promote vegetative growth at the expense of fruit production.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter into the soil around pomegranate trees to improve soil fertility, structure, and water retention. Apply well-decomposed compost or aged manure in early spring as a top dressing. Mulch around the base of the tree to conserve moisture, suppress weeds, and provide a steady supply of nutrients.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Pomegranates are typically planted in late winter or early spring when the soil temperature is around 60°F (15°C). This allows the tree to establish roots before the hot summer months. Choose a site with good drainage and full sunlight for optimal growth and fruit production.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for Pomegranates.";
                }
            } else if (selectedCrop.equalsIgnoreCase("Corn")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Corn thrives in warm climates with well-drained, fertile soil. Choose a site with full sunlight and good air circulation. Plant corn seeds directly in the soil once the danger of frost has passed and soil temperatures are consistently above 55°F (13°C). Space seeds 8-12 inches apart in rows spaced 30-36 inches apart.";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Corn requires consistent moisture throughout the growing season, especially during tasseling and pollination. Water deeply, providing 1-1.5 inches of water per week, either through rainfall or irrigation. Mulching can help retain soil moisture.";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Common diseases affecting corn include gray leaf spot, northern corn leaf blight, and common rust. To prevent diseases, practice crop rotation, select disease-resistant varieties, and use fungicides preventively. Monitor plants regularly for signs of disease and treat promptly.";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Corn has high nutrient requirements, particularly nitrogen (N), phosphorus (P), and potassium (K). Apply a balanced fertilizer before planting, with additional side-dressing of nitrogen during the growing season. Soil testing can help determine specific nutrient needs.";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Incorporate organic matter such as compost or well-rotted manure into the soil before planting corn to improve soil fertility and structure. Organic mulches can also help conserve soil moisture and suppress weeds.";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Corn is typically planted in spring after the last frost date when soil temperatures have warmed to at least 55°F (13°C). Choose a site with well-drained soil and full sunlight. Corn matures in about 60-100 days, depending on the variety.";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for Corn.";
                }
            }else if (selectedCrop.equalsIgnoreCase("rice")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Rice growth information here...";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Rice watering information here...";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Rice disease prediction here...";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Rice fertilizer information here...";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Rice organic manure information here...";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Rice suitable season information here...";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for rice.";
                }
            }else if (selectedCrop.equalsIgnoreCase("rice")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Rice growth information here...";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Rice watering information here...";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Rice disease prediction here...";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Rice fertilizer information here...";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Rice organic manure information here...";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Rice suitable season information here...";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for rice.";
                }
            }else if (selectedCrop.equalsIgnoreCase("rice")) {
                if (selectedAspect.equalsIgnoreCase("growth")) {
                    message = "Rice growth information here...";
                } else if (selectedAspect.equalsIgnoreCase("watering")) {
                    message = "Rice watering information here...";
                } else if (selectedAspect.equalsIgnoreCase("disease prediction")) {
                    message = "Rice disease prediction here...";
                } else if (selectedAspect.equalsIgnoreCase("fertilizer")) {
                    message = "Rice fertilizer information here...";
                } else if (selectedAspect.equalsIgnoreCase("organic manure")) {
                    message = "Rice organic manure information here...";
                } else if (selectedAspect.equalsIgnoreCase("suitable season")) {
                    message = "Rice suitable season information here...";
                } else {
                    message = "Please specify an aspect such as growth, watering, disease prediction, fertilizer, organic manure, or suitable season for rice.";
                }
            }
            // Add similar blocks for other crops

            appendToChatArea(message);
        }
    }

    private void appendToChatArea(String message) {
        chatArea.append(message + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Chatbot());
    }
}
