function changeContent(page) {
	var contentDiv = document.getElementById('content');
	switch (page) {
		case 'home':
			contentDiv.innerHTML = `
				<h2>
					Welcome to CrissCross Pharmacy!
				</h2>
				<p>
					Please explore our various services and offerings:
				</p>
				<div class="link-container">
					<div class="service-card background-image" style="background-image: url(&quot;&quot;);">
						<div class="box-icon">
							<img decoding="async" src="" alt="pharmacy 3">
						</div>
						<h3 class="box-title title">
							<a href="">Prescribing Services</a>
						</h3>
						<a href="" class="">Read More</a>
					</div>
					<div class="service-card background-image" style="background-image: url(&quot;&quot;);">
						<div class="box-icon">
							<img decoding="async" src="https://whitecrossdispensary.com/wp-content/uploads/2022/08/pharmacy-3.png" alt="pharmacy 3">
						</div>
						<h3 class="box-title title">
							<a href="">Prescribing Services</a>
						</h3>
						<a href="" class="">Read More</a>
					</div>	
				</div>	
			`;
			break;
		case 'appointment':
			contentDiv.innerHTML = `
				<h2>About Us</h2>
				<p>
					This is the about page content. Learn more 
					about our purpose and team.
				</p>
				<p>
					We're passionate about creating engaging and
					informative SPAs.
				</p>
			`;
			break;
		case 'order':
			contentDiv.innerHTML = 
				`<h2>Contact Us</h2> 
				<p>
					Feel free to reach out to us!
				</p> 
				<form> 
				<label for="name">Name:</label> 
				<input type="text" id="name" name="name" 
						placeholder="Your Name" required>
				<label for="email">Email:</label> 
				<input type="email" id="email" name="email" 
						placeholder="Your Email" required>
				<label for="message">Message:</label> 
				<textarea id="message" name="message" 
							placeholder="Your Message" 
							rows="4" required>
					</textarea>
				<button type="submit">Send Message</button> 
				</form>`;
			break;
		case 'signup':
			contentDiv.innerHTML = 
				`<h2>Contact Us</h2> 
				<p>
					Feel free to reach out to us!
				</p> 
				<form> 
				<label for="name">Name:</label> 
				<input type="text" id="name" name="name" 
						placeholder="Your Name" required>
				<label for="email">Email:</label> 
				<input type="email" id="email" name="email" 
						placeholder="Your Email" required>
				<label for="message">Message:</label> 
				<textarea id="message" name="message" 
							placeholder="Your Message" 
							rows="4" required>
					</textarea>
				<button type="submit">Send Message</button> 
				</form>`;
			break;

		default:
			contentDiv.innerHTML = '<h2>Page not found!</h2>';
	}
}
