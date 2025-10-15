from pyspark.sql import SparkSession

def process_invoice(customer, amount):
    discount = 15
    total = amount - discount
    unused = 42
    print(f"Invoice for {customer}: {total}")

if __name__ == "__main__":
    spark = SparkSession.builder.appName("Billing").getOrCreate()
    process_invoice("bob", 500)
    spark.stop()
