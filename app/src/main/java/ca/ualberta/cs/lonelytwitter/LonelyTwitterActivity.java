package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;

	private ArrayList<Tweet> tweetList;
	private ArrayAdapter<Tweet> adapter;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {   //first methood called
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);                //resources

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();

				Tweet tweet = new NormalTweet(text);
				adapter.notifyDataSetChanged();
				tweetList.add(tweet);

				saveInFile();
//				finish();

			}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
//		String[] tweets = loadFromFile();
		loadFromFile();

		adapter = new ArrayAdapter<Tweets>(context tjos, R.layout.list_item, tweetList);
//		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//				R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter);
//		NormalTweet normalTweet = new normalTweet("");
	}
	public void clear(View view) {
		EditText editText = (EditText) findViewById(R.layout.list_item, tweetList);	``
		String message = editText.getText().toString();

	}
	private void loadFromFile() {
//		ArrayList<String> tweets = new ArrayList<String>()
// ;
		try {
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			Gson gson = new Gson();

			// taken from stackoveflow fson covert form hson to a typed array
			//2018
			Type listType = new TypeToken<ArrayList<NormalTweet>(){}.getType;
			tweetList = gson.fromJson(in, listType);

//			String line = in.readLine();
//			while (line != null) {
//				tweets.add(line);
//				line = in.readLine();
//			}

		} catch (FileNotFoundException e) {
			tweetList = new ArrayList<Tweet>();

		} catch (IOException e) {
			throw new RuntimeException();
		}
		return tweets.toArray(new String[tweets.size()]);
	}

	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_PRIVATE);           //override writing
			BufferedWriter out = new BufferedWriter( new OutputStreamWriter(fos));
			GSON gson = new GSON();
			gson.toJson(tweetList, out);
			out.flush(); //clear bufer
//
//			fos.write(new String(date.toString() + " | " + text)
//					.getBytes());
//			fos.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException();

			e.printStackTrace();
		} catch (IOException e) {
			throw new RuntimeException();

			e.printStackTrace();
		}
	}
}