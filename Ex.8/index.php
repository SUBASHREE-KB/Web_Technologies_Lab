<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cafe Menu</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            text-align: center;
            background-color: cornsilk; 
        }

        h2 {
            color: #333;
        }

        table {
            width: 50%;
            margin: 0 auto;
            border-collapse: collapse;
            margin-top: 10px;
            background-color: white; 
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>

<body>
    <?php
    $xmlFile = 'cafe_menu.xml';

    if (file_exists($xmlFile)) {
        $xml = simplexml_load_file($xmlFile);

        if ($xml) {
            echo "<h2>My Cafe's Menu</h2>";

            foreach ($xml->category as $category) {
                $categoryName = (string)$category['name'];

                echo "<h3>$categoryName</h3>";
                echo "<table>";
                echo "<tr><th>Item</th><th>Price</th></tr>";

                foreach ($category->item as $item) {
                    $itemName = (string)$item->name;
                    $itemPrice = (string)$item->price;

                    echo "<tr><td>$itemName</td><td>$itemPrice</td></tr>";
                }

                echo "</table>";
            }
        } else {
            echo "Error loading XML";
        }
    } else {
        echo "XML file not found";
    }
    ?>
</body>

</html>
