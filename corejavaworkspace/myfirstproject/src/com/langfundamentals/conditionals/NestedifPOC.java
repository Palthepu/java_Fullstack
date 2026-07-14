package com.langfundamentals.conditionals;

import java.util.Scanner;

public class Nestediftask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Have you uploaded resume?");
		boolean resume = sc.nextBoolean();

		if (resume == true) {

			System.out.println("Are you a graduate?");
			boolean graduate = sc.nextBoolean();

			if (graduate) {

				System.out.println("You are eligible..Enter your percentage");
				float percentage = sc.nextFloat();

				if (percentage >= 65) {

					System.out.println("Do you have any education gap? (true/false)");
					boolean gap = sc.nextBoolean();

					if (!gap) {

						System.out.println("Do you know java? (true/false)");
						boolean java = sc.nextBoolean();

						if (java == true) {

							System.out.println("Good what about oops?");
							boolean oops = sc.nextBoolean();

							if (oops) {

								System.out.println("do you know sql?");
								boolean sql = sc.nextBoolean();

								if (sql) {

									System.out.println("Do you know HTML and CSS?");
									boolean htmlcss = sc.nextBoolean();

									if (htmlcss) {

										System.out.println("Have you done any internship?");
										boolean internship = sc.nextBoolean();

										if (internship) {

											System.out.println("Are your communication skills good?");
											boolean communication = sc.nextBoolean();

											if (communication) {

												System.out.println("Are you willing to relocate?");
												boolean relocate = sc.nextBoolean();

												if (relocate) {

													System.out.println("What is your expected salary?");
													double salary = sc.nextDouble();

													if (salary <= 25000) {

														System.out.println("Can you join immediately?");
														boolean join = sc.nextBoolean();

														if (join) {

															System.out.println("Did you clear the aptitude round?");
															boolean aptitude = sc.nextBoolean();

															if (aptitude) {

																System.out.println("Did you clear the technical round?");
																boolean technical = sc.nextBoolean();

																if (technical) {

																	System.out.println("Did you clear the HR round? (true/false)");
																	boolean hr = sc.nextBoolean();

																	if (hr) {
																		System.out.println("You are selected");
																	} else {
																		System.out.println("HR round not cleared");
																	}

																} else {
																	System.out.println("Technical round not cleared");
																}

															} else {
																System.out.println("Aptitude round not cleared");
															}

														} else {
															System.out.println("Immediate joiners preferred.");
														}

													} else {
														System.out.println("Expected salary exceeds the company budget");
													}

												} else {
													System.out.println("Candidate not willing to relocate.");
												}

											} else {
												System.out.println("Please improve your communication skills");
											}

										} else {
											System.out.println("Internship preferred");
										}

									} else {
										System.out.println("Learn html and css");
									}

								} else {
									System.out.println("Learn sql");
								}

							} else {
								System.out.println("Learn oops concepts");
							}

						} else {
							System.out.println("Learn java and reapply");
						}

					} else {
						System.out.println("rejected due to education gap");
					}

				} else {
					System.out.println("minimum 65% required");
				}

			} else {
				System.out.println("You are not eligible. Graduation required");
			}

		} else {
			System.out.println("Please Upload your resume");
		}


	}
}
