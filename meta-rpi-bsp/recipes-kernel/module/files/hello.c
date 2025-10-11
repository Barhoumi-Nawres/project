#include <linux/kernel.h>
#include <linux/module.h>
#include <linux/init.h>

MODULE_LICENSE("GPL");
MODULE_DESCRIPTION("Simple kernel module");
MODULE_AUTHOR("Nawres");
static int __init hello_init(void){
	pr_info("hello from module\n");
	return 0;

}

static void __exit hello_exit(void){

	pr_info("Good bye from module\n ");

}

module_init(hello_init);
module_exit(hello_exit);
