package com.yash.test;

import static org.junit.Assert.assertThat;
import org.junit.Test;
import com.yash.main.Armstrong;
import static org.hamcrest.core.IsEqual.equalTo;

public class ArmstrongTest {

	Armstrong armstrong = new Armstrong();

	@Test
	public void check153() {
		assertThat(armstrong.isValid(153), equalTo(true));
	}

	@Test
	public void check370() {
		assertThat(armstrong.isValid(370), equalTo(true));
	}

	@Test
	public void check407() {
		assertThat(armstrong.isValid(407), equalTo(true));
	}

	@Test
	public void check8208() {
		assertThat(armstrong.isValid(8208), equalTo(true));
	}

}
