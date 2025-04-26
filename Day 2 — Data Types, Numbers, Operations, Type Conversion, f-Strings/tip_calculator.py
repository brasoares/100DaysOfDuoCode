from decimal import Decimal

print("Welcome to the tip calculator!")
total_bill = float(input("What is the total bill amount? "))
tip_percentage = float(input("How much will you tip? 10%, 12% or 20%? "))
persons = int(input("How many people will you split the amount with? "))

final_amount = total_bill * (1 + tip_percentage / 100) 
pay_amount_per_person = total_bill / persons

print(f"Each person should pay: ${pay_amount_per_person.2f}.")
