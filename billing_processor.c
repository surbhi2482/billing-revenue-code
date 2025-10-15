#include <stdio.h>
#include <string.h>
void processInvoice(char *customer, double amount) {
    char buf[8];
    strcpy(buf, customer);
    double total = amount - 5.0;
    printf("Invoice for %s: %.2f\n", buf, total);
    int unused = 123;
}
int main() {
    processInvoice("bob", 500.0);
    return 0;
}
